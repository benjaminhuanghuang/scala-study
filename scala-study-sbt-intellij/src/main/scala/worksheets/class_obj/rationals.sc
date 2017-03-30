// https://www.coursera.org/learn/progfun1/lecture/5mmJP/lecture-2-5-functions-and-data

object rationals_exe {
  val x = new Rational(1, 2)
  x.numer
  x.denom

  var y = new Rational(2, 3)
  var z = new Rational(3, 2)
  x.add(y)
  x.sub(y).sub(z)
}


class Rational(x: Int, y: Int) {
  def numer = x

  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def neg: Rational = new Rational(-numer, denom)

  def sub(that: Rational) = add(that.neg)

  override def toString = numer + "/" + denom

  def addRational(r: Rational, s: Rational): Rational =
    new Rational(
      r.numer * s.denom + s.numer * r.denom,
      r.denom * s.denom)

  def makeString(r: Rational) =
    r.numer + "/" + r.denom
}