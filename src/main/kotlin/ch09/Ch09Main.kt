package ch09

import java.util.function.BiPredicate

fun main(args: Array<String>) {
    /*
    val authors = listOf("Dmitry", "Svetlana") //타입인자추론
    //val readers: MutableList<String> = mutableListOf() //변수 타입을 지정
    val readers = mutableListOf<String>()//변수를 만드는 함수의 인자를 지정
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))//타입인자를 명시적으로 지정한다
    println(letters.slice(10..13))//컴파일러는 여기서 T가 Char라는 사실을 추론
     */
    //println(listOf(1, 2, 3, 4).penultimate)//이 호출에서 T는 Int로 추론
    //println(oneHalf(3))
    //println(max("kotlin", "java"))//문자열은 알파벳순으로 비교된다
    /*
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
     */
    /*
    val nullableStringProcessor = Processor<String?>()//널이 될수 있는 타입인 String?이 T를 대신한다
    nullableStringProcessor.process(null)//null이 value 인자로 지정된다
     */
}
val <T> List<T>.penultimate: T //모든 리스트 타입에 이 제네릭 확장 프로퍼티를 사용할 수 있다
    get() = this[size - 2]

fun<T: Number> oneHalf(value: T): Double{ //Number를 타입 파라미터 상한으로 정한다
    return value.toDouble() / 2.0 //Number 클래스에 정의된 메서드를 호출
}

fun <T: Comparable<T>> max(first: T, second: T): T { //이 함수의 인자들은 비교 가능해야 한다
    return if(first > second) first else second
}

fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T : Appendable{ //타입 파라미터 제약 목록
        if(!seq.endsWith('.')){//CharSequence 인터페이스의 확장 함수를 호출
            seq.append('.')//Appendable 인터페이스의 메서드를 호출
        }
    }