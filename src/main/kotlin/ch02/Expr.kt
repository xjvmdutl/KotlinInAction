package ch02

interface Expr
class Num(val value: Int) : Expr //Value라는 프로퍼티만 존재하는 단순한 클래스로 Expr 인터페이스를 구현한다
//Expr 타입의 객체라면 어떤 것이나 sum 연산의 인자가 될 수 있다.
//따라서 Num이나 다른 Sum 인자가 올수 있다.
class Sum(val left: Expr, val right: Expr) : Expr

/*
fun eval(e: Expr): Int{
    if(e is Num){
        val n = e as Num
        return n.value
    }
    if(e is Sum){
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}
 */
/*
fun eval(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }
 */
fun eval(e: Expr): Int =
    when (e) {
        is Num -> {
            e.value
        }
        is Sum -> {
            eval(e.right) + eval(e.left)
        }
        else -> {
            throw IllegalArgumentException("Unknown expression")
        }
    }
fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num:${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left);
            val right = evalWithLogging(e.right);
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }
