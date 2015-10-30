class Rational(x: Int, y: Int) {

  require(y!=0,"Denom cannot be zero")
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  private def g = gcd(x, y)

  def numer = x / g
  def denom = y / g

  def addRational(that: Rational) = {
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
  }

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = addRational(that.neg)
  def less(that: Rational) = numer * that.denom < denom * that.numer
  def max(that:Rational)=if (this.less(that)) that else this
  override def toString = numer + "/" + denom
}

val r1 = new Rational(1, 3)
val r2 = new Rational(5, 7)
val r3 = new Rational(3, 2)
r1.addRational(r2)
r1.sub(r2).sub(r3)
r2.addRational(r2)
r2.less(r3)
r2.max(r3)

r1 addRational r2


