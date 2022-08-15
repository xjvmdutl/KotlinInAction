package ch09

interface Producer<out T> { //클래스가 T에 대해 공변적이라고 선언
    fun produce(): T
}