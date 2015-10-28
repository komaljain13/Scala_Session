def balance(chars: List[Char]) = {
  def countOpenBraces(chars: List[Char], openBracesCount: Int): Boolean = {
    if (chars.isEmpty) {
      openBracesCount == 0
    }
    else {
      val head = chars.head
      val num =
        if (head == ')') openBracesCount - 1
        else if (head == '(') openBracesCount + 1
        else openBracesCount

      if (num >= 0) countOpenBraces(chars.tail, num)
      else false
    }
  }

  countOpenBraces(chars, 0)
}

val string = "(()))"

balance(string.toList)








