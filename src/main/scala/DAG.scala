import platform.common_classes.SparkOp

object DAG {
  val ops: Set[SparkOp] = Set(
    // legacy.SparkOpInstance1, // Removed reference to SparkOpInstance1 as it has been migrated to a new submodule
    // legacy.SparkOpInstance2, // Removed reference to SparkOpInstance2 as it has been migrated to a new submodule
    legacy.SparkOpInstance3,
    legacy.SparkOpInstance4,
    legacy.SparkOpInstance5,
    legacy.SparkOpInstance6,
    legacy.SparkOpInstance7,
    legacy.SparkOpInstance8,
    legacy.SparkOpInstance9,
    legacy.SparkOpInstance10,
    legacy.SparkOpInstance11,
    legacy.SparkOpInstance12,
    legacy.SparkOpInstance13,
    legacy.SparkOpInstance14,
    legacy.SparkOpInstance15,
    legacy.SparkOpInstance16,
    legacy.SparkOpInstance17,
    legacy.SparkOpInstance18,
    legacy.SparkOpInstance19,
    legacy.SparkOpInstance20
  )
}
