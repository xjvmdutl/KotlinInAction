package ch04

import java.lang.IllegalArgumentException

sealed class Expr { //기반 클래스 sealed 로 봉인
    class Num(val value: Int) : Expr() //기반클래스의 모든 하위 클래스를 중첩클래스로 나열
    class Sum(val left: Expr, val right: Expr) : Expr()

}

fun eval(e: Expr): Int =
    when(e){ //when 식이 모든 하위 클래스를 검사하므로 별도의 else 분기가 없어도 된다
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }

