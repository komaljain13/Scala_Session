import java.util.NoSuchElementException

trait List[T]{

  def isEmpty : Boolean
  def head : T
  def tail : List[T ]
}


class cons[T](val head:T,val tail:List[T]) extends List[T]{
  def isEmpty=false
}

class Nil[T] extends List[T]{
  def isEmpty=true
  def head : Nothing=throw new NoSuchElementException("Nil.head")
  def tail : Nothing=throw new NoSuchElementException("Nil.tail")

}

def SingletonList[T](elem:T)=new cons[T](elem,new Nil[T])
SingletonList(1)
SingletonList(true)

