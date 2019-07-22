object ExprConvertions {
  implicit def int2Expr(x:Int) = new Expr(x)

  implicit def str2Expr(x:String) = new Expr(x)

  implicit def bool2Expr(x: Boolean) = new Expr(x)
}
