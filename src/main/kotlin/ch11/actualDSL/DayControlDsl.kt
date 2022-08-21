package ch11.actualDSL

import java.time.LocalDate
import java.time.Period

val Int.days: Period
    get() = Period.ofDays(this) //this는 상수의 값을 가리킨다.

val Period.ago: LocalDate
    get() = LocalDate.now() - this //연산자 관례를 사용해 LocalDate.minus 호출

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this //연산자 관례를 사용해 LocalDate.plus 호출

fun main() {
    println(1.days.ago)
    println(1.days.fromNow)
}