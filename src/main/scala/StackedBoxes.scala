object StackedBoxes extends App {
  val boxes = args.filter(_.length % 2 == 1).sortBy(_.length)
  val widthStack = boxes.last.length
  boxes.foreach { name =>
    println(rowToString("-" * name.length, widthStack, '+'))
    println(rowToString(name, widthStack, '|'))
  }
  println(rowToString("-" * widthStack, widthStack, '+'))


  def rowToString(name: String, maxWidth: Int, separator: Char): String = {
    val offset = (maxWidth - name.length) / 2
    " " * offset + separator.toString + name + separator.toString + " " * offset
  }

}
