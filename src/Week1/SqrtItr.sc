def abs(x: Double) = if (x < 0) -x else x

def sqrtItr(guess: Double, x: Double):Double = {
  if (isGoodEnough(guess, x)) guess
  else sqrtItr(improve(guess, x), x)
}

def isGoodEnough(guess: Double, x: Double) =
  abs(guess * guess - x)/x < .001

def improve(guess: Double, x: Double):Double =
  (guess + x / guess) / 2

def sqrt(x:Double)=sqrtItr(1.0,x)

sqrt(2)
sqrt(4)
//sqrt(16)
//sqrt(1e-6)
//sqrt(1e60)



