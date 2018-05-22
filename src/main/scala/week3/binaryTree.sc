class BinaryTree(value: String) {
  def leftChild = None
  def rightChild = None

  def insertLeft(value: String) = {
    val res = new BinaryTree(value)
    if (value.isEmpty) res.leftChild
    else
      res.leftChild
  }

  def insertRight(value: String) = {
    val res = new BinaryTree(value)
    if (value.isEmpty) res
    else
      res.rightChild
  }
}

//def insertLeft(value: Option[String], tree: BinaryTree) = {
//  val res = new BinaryTree(value)
//  if (value.isEmpty) res
//  else
//    res.leftChild
//}

//def insertRight(value: Option[String], tree: BinaryTree) = {
//  val res = new BinaryTree(value)
//  if (value.isEmpty) res
//  else
//    res.rightChild
//}

val aNode = new BinaryTree("a")
aNode.insertLeft("b")
//val tree = new BinaryTree(Some("a"))
//println(tree)
//println(tree.insertLeft(Some("b")))
//println(tree.insertLeft(Some("c")))