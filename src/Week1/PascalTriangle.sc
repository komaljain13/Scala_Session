def pascal(c:Int,r:Int):Int={
  if(c==0||c==r)
    1
  else
    pascal(c,r-1)+pascal(c-1,r-1)
}

for (row <- 0 to 5) {
  for (col <- 0 to row)
    print(pascal(col, row) + " ")
  println()
}


