def id(x:Int)=x
def cube(x:Int)=x*x*x

/*
def sum(f:Int=>Int):(Int,Int)=>Int={
  def sumF(a:Int,b:Int):Int=
  if(a>b)0
  else f(a)+sumF(a+1,b)
  sumF
}
*/

def sum(f:Int=>Int)(a:Int,b:Int):Int=
    if(a>b)0 else f(a)+sum(f)(a+1,b)

sum(cube)(1,2)




