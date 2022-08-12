package ch08

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

fun main(args: Array<String>) {
    /*
    //코틀린은 타입 추론으로 인해 변수 타입을 지정하지 않아도 된다.
    val sum = {x: Int, y: Int -> x + y}
    val action = {println(42)}
     */
    /*
    val sum: (Int, Int) -> Int = { x, y -> x + y } //Int 파라미터 2개 받아서 Int 값을 반환하는 함수
    val action: () -> Unit = { println(42) } //아무 인자도 받지 않고 아무 값도 반환하지 않는 함수
    var canReturnNull: (Int, Int) -> Int? = { x, y -> null }//반환타입 널
    var funOrNul: ((Int, Int) -> Int)? = null
     */
    /*
    val url = "http//kotl.in"
    performRequest(url) { code, content -> /* ... */ //API에서 제공하는 이름을 람다에 사용할 수 있다
    }
    performRequest(url) { code, page -> /* ... */ //하지만 그냥 원하는 다른 이름을 붙여도 상관 없다
    }
     */
    /*
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
     */
    //println("ab1c".filter { it in 'a'..'z' }) //람다를 predicate 파라미터로 전달한다
    /*
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString()) //디폴트 변환 함수를 사용한다
    println(letters.joinToString { it.toLowerCase() }) //람다를 인자로 전달한다
    println(
        letters.joinToString(separator = "! ", postfix = "! ",
            transform = { it.toUpperCase() }) //이름붙인 인자 구문을 사용해 람다를 포함하는 여러 인자를 전달한다
    )
     */
    /*
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED) //반환받은 함수를 변수에 저장
    println("Shipping costs ${calculator(Order(3))}") //반환받은 함수를 호출한다
     */
    /*
    val contacts = listOf(
        Person("Dmitry", "Jemerov", "123-4567"),
        Person("Svetlanma", "Isakova", null)
    )
    val contactListFilters = ContactListFilters()
    with(contactListFilters){
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }
    println(contacts.filter(
        contactListFilters.getPredicate())) //getPredicate이 반환한 함수를 filter에게 인자로 넘긴다
     */
    /*
    val averageWindowsDuration = log
        .filter { it.os == OS.WINDOWS }
        .map(SiteVisit::duration)
        .average()
    println(averageWindowsDuration)
     */
    /*
    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.IOS))
     */
    /*
    val averageMobileDuration = log
        .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
        .map(SiteVisit::duration)
        .average()
    println(averageMobileDuration)
     */
    /*
    println(log.averageDurationFor {
        it.os in setOf(OS.ANDROID, OS.IOS)
    })
    println(log.averageDurationFor {
        it.os == OS.IOS && it.path == "/signup"
    })
     */
    /*
    val lock = ReentrantLock()
    synchronized(lock){
        // logic
    }
     */
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age < 30 })
    //람다를 사용하지 않은 컬렉션 거르기
    val result = mutableListOf<Person>()
    for (person in people) {
        if (person.age < 30)
            result.add(person)
    }
    println(result)

    println(people.filter { it.age < 30 }.map( Person::name))
     */
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    lookForAlice(people)
    /*
    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
     */
    people.filter(fun (person): Boolean{ //무명함수 넘기기
        return person.age < 30
    })
    people.filter(fun (person) = person.age < 30)//식이 본문인 무명함수
}

fun performRequest(
    url: String,
    callback: (code: Int, content: String) -> Unit //함수 타입의 각 파라미터에 이름을 붙힌다
) {
    //Logic
}

fun twoAndThree(operation: (Int, Int) -> Int) { //함수 타입인 파라미터를 선언한다
    val result = operation(2, 3) //함수 타입인 파라미터를 호출한다
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element))
            sb.append(element) //predicate 파라미터로 전달받은 함수를 호출
    }
    return sb.toString()
}

/* 코틀린 선언 */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}
/*
fun <T> Collection<T>.joinToString(
    separator:String = ", ",
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()){
        if(index > 0) result.append(separator)
        result.append(element) //기본 toString 메서드를 사용해 객체를 문자열로 변환
    }
    result.append(postfix)
    return result.toString()
}
 */
/*
fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String,
    postfix: String,
    transform: (T) -> String = { it.toString() } //함수 타입 파라미터를 선언하면서 람다를 디폴트 값으로 지정한다
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element)) //transform 파라미터로 받은 함수를 호출한다
    }
    result.append(postfix)
    return result.toString()
}
 */

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String,
    postfix: String,
    transform: ((T) -> String)? = null //널이 될 수 있는 함수 타입의 파라미터를 선언한다.
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        var str = transform?.invoke(element) //안전 호출을 사용해 함수를 호출한다
            ?: element.toString() //엘비스 연산자를 사용해 람다를 인자로 받지 않은 경우를 처리한다
    }
    result.append(postfix)
    return result.toString()
}

/*
fun List<SiteVisit>.averageDurationFor(os:OS) =
    filter { it.os == os }.map(SiteVisit::duration).average()
 */
fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    println("Before sync")
    synchronized(lock) {
        println("Action")
    }
    println("After sync")
}

/*
fun <T, R> Sequence<T>.map(transform: (T) -> R): Sequence<R>{
    return TransformingSequence(this, transform)
}
 */
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    //...
}

fun readFirstLineFromFile(path: String): String{
    BufferedReader(FileReader(path)).use{br -> //BufferedReader 객체를 만들고 use 함수를 호출하면서 파일에 대한 연산을 실행할 람다를 넘긴다
        return br.readLine() //자원에서 맨 처음 가져온 한줄을 람다가 아닌 readFirstLineFromFile에서 반환한다
    }
}