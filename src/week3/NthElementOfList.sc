

object nth{

  def nth[T](index:Int,list:List[T])={
    if (index==0) list.head
    else nth(index-1,list.tail)
  }

}