def sumOfInts(a: Int, b: Int): Int =
  if (a > b) 0 else a + sumOfInts(a + 1, b)

def id(x: Int): Int = x
def cubes(x: Int) = x * x * x

def sumOfCubes(a: Int, b: Int): Int = {
  if (a > b) 0 else cubes(a) + sumOfCubes(a + 1, b)
}

def sum(f: Int => Int, a: Int, b: Int):Int= {
  if (a > b) 0 else f(a) + sum(f, a + 1, b)
}

sumOfInts(2, 5)
sumOfCubes(2, 4)
sum(id, 2, 5)
sum(cubes, 2, 4)
