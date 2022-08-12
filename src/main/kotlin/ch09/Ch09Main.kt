package ch09

fun main(args: Array<String>) {
    val authors = listOf("Dmitry", "Svetlana") //타입인자추론
    //val readers: MutableList<String> = mutableListOf() //변수 타입을 지정
    val readers = mutableListOf<String>()//변수를 만드는 함수의 인자를 지정
}