import munit.FunSuite
import legacy._
import platform.common_classes.SparkOp
import DAG.ops

class DAGConfigurationSpec extends FunSuite {
  test("DAG should have no cycles") {
    val visited = scala.collection.mutable.Set[String]()
    val recStack = scala.collection.mutable.Set[String]()

    def isCyclic(op: SparkOp): Boolean = {
      println(s"Checking for cycles at: ${op.name}")
      if (recStack.contains(op.name)) return true
      if (visited.contains(op.name)) return false

      visited.add(op.name)
      recStack.add(op.name)

      val result = op.inputs.exists { input =>
        ops.exists(_.name == input) && isCyclic(ops.find(_.name == input).get)
      }
      recStack.remove(op.name)
      result
    }

    val hasCycles = ops.exists(isCyclic)
    assert(!hasCycles, "The DAG contains cycles")
  }

  test("DAG should have connectivity from roots") {
    // Identify all root nodes (nodes with no inputs)
    val roots = ops.filter(_.inputs.isEmpty)
    println(s"Root nodes: ${roots.map(_.name)}") // Added debug print statement to confirm root nodes
    val allNodes = ops.map(_.name).toSet

    def reachFromRoot(op: SparkOp, visited: Set[String]): Set[String] = {
      println(s"Starting reachFromRoot for: ${op.name}, visited: $visited") // Added debug print statement
      if (visited.contains(op.name)) {
        return visited
      }
      val newVisited = visited + op.name
      println(s"New visited set before recursion: $newVisited") // Added debug print statement
      val inputs = op.inputs // No need to map to input.name, inputs are already Strings
      println(s"Inputs of ${op.name}: $inputs") // Added debug print statement
      inputs.flatMap { inputName =>
        println(s"Recursively calling reachFromRoot from ${op.name} to $inputName") // Added debug print statement
        ops.find(_.name == inputName).map(reachFromRoot(_, newVisited)).getOrElse(newVisited)
      } + op.name
    }

    // Collect all nodes reachable from any root
    val reachableNodes = roots.flatMap(root => reachFromRoot(root, Set.empty)).toSet
    println(s"Reachable nodes: $reachableNodes") // Added debug print statement
    println(s"All nodes: $allNodes") // Added debug print statement
    assert(reachableNodes == allNodes, "Not all nodes are reachable from the roots")
  }
}
