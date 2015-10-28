import scala.collection.mutable

def flattenList(nestedList:List[Object])={
    def simplifyList(flattenList:mutable.MutableList[Any],nestedList:List[Any]):mutable.MutableList[Any]={
      if(nestedList.isEmpty)flattenList
      else{
        def elem=nestedList.head
        if (elem.isInstanceOf[List[Any]]) simplifyList(flattenList,nestedList.head.asInstanceOf[List[Any]])
        else {
          if(flattenList.isEmpty)flattenList==mutable.MutableList(elem)
          else elem +: flattenList
        }
        simplifyList(flattenList,nestedList.tail)
      }
    }
    simplifyList(mutable.MutableList(),nestedList)
  }
  flattenList(List(List(5,4),List(5,List(8,9),5)))

