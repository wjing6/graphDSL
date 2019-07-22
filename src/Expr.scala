class Expr(v: Any) {
  def len = v match {
    case s:String => s.length()
    case _ => -1
  }

  def asBool = v match {
    case i:Int => i != 0
    case b:Boolean => b
    case s:String => s != null && s.length() != 0
    case _ => false
  }

  def in(args: Any*) = args.exists(arg => arg == v)

  def notin(args: Any*) = !args.exists(arg => arg == v)

  def and(that: Expr) = this.asBool && that.asBool

  def or(that: Expr) = this.asBool || that.asBool

}
