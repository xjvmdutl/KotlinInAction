package ch06

import ch06.java.CollectionUtils
import ch06.java.Person
import java.io.BufferedReader
import java.io.StringReader
import java.security.CodeSource
import java.text.NumberFormat
import java.util.StringJoiner

fun main(args: Array<String>) {
    //println(strLenSafe(null))
    /*
    val x : String? = null
    val y:String = x
    strLen(x)
     */
    /*
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
     */
    /*
    printAllCaps("abc")
    printAllCaps(null)
     */
    /*
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(ceo))
    println(managerName(developer))
     */
    /*
    val person = Person("Dmitry", null)
    println(person.countryName())
     */
    /*
    println(strLenSafe("abc"))
    println(strLenSafe(null))
     */
    /*
    val address = Address("Elsestr. 47", 80687, "Munich", "Germany")
    val jetBrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetBrains)
    printShippingLabel(person)
    printShippingLabel(Person("Alexey", null))
     */
    /*
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
     */
    //ignoreNulls(null)
    /*
    val email: String? = null
    if(email != null)
        sendEmailTo(email)
     */
    /*
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }
    */
    /*
    val person: Person? = getTheBestPersonInTheWorld()
    if(person != null)
        sendEmailTo(person.email)

     */
    /*
    verifyUserInput(" ")
    verifyUserInput(null)
     */
    //printHashCode(null) //T타입은 Any?로 추론된다
    //println(42)
    //yellAt(Person(null))
    /*
    val person = Person("2")
    val i:Int = person.name
     */
    /*
    val i:Int = 1
    val list:List<Int> = listOf(1, 2, 3)
     */
    //showProgress(146)
    /*
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
    val listOfInts = listOf(1, 2, 3)
     */
    /*
    val i = 1
    val l: Long = i
     */
    /*
    val x = 1
    val list = listOf(1L, 2L, 3L)
    //println(x in list)
    println(x.toLong() in list)
     */
    /*
    val b: Byte = 1 //상수 값은 적절한 타입으로 해석
    val l = b + 1L //+는 byte와 long을 인자로 받을 수 있다
    foo(42) //컴파일러는 42를 Long값으로 해석
     */
    //val answer: Any = 42 //Any가 참조 타입이기 때문에 42 박싱
    //fail("Error occurred")
    /*
    val address = company.address?: fail("No address")
    println(address.city)
    */
    /*
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
     */
    /*
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
     */
    /*
    val list = listOf("a", "b", "c")
    printInUppercase(list)
     */
    /*
    for(i in args.indices){
        println("Argument $i is: ${args[i]}")
    }
     */
    /*
    val letters = Array<String>(26){i -> ('a' + i).toString()}
    println(letters.joinToString(" "))
     */
    /*
    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))
     */
    /*
    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)
     */
    /*
    val squares = IntArray(5){ i -> (i+1) * (i+1)}
    println(squares.joinToString())
     */
    args.forEachIndexed{ index, element ->
        println("Argument $index is: $element")
    }
}


fun strLen(s: String) = s.length

/*
fun strLenSafe(s: String?) = //s.length
    s?.length ?: 0
*/
/*
fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0 //null검사를 추가하면 코드가 컴파일된다
 */
fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun foo(s: String?) {
    val t: String = s ?: ""//s 가 null 이면  결과는 "" 이다.
}

fun foo(l: Long) {
    println(l)
}

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!! //예외는 이 지점을 가리킨다
    println(sNotNull.length)
}

fun sendEmailTo(email: String) {
    //logic
    println("sending email to $email")
}

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) //안전한 호출을 하지 않아도 된다
        println("Please fill in the required fields")
}
/*
fun <T> printHashCode(t: T){
    println(t?.hashCode()) //t가 null이 될 수 있으므로 안전한 호출을 써야하만 한다
}
 */

fun <T : Any> printHashCode(t: T) {
    println(t.hashCode())
}

/*
fun yellAt(person: Person){
    println(person.name.toUpperCase() + "!!!") //toUpperCase의 수신 객체 person.name이 널이여서 예외 발생
}
 */
fun yellAt(person: Person) {
    //println((person.name ?: "AnyOne").toUpperCase() + "!!!")
}

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We 're ${percent} % done!")
}

/*
fun f(): Unit {
    //logic
}
 */
fun f() {

}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>() //널이 될 수 있는 Int 값으로 이뤄진 리스트 생성
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            result.add(number) //정수를 리스트에 추가
        } catch (e: NumberFormatException) {
            result.add(null) //현재 줄을 파싱할 수 없으므로 리스트에 널을 추가
        }
    }
    return result
}
/*
fun addValidNumbers(numbers: List<Int?>){
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for(number in numbers){ //리스트에서 널이 될수 있는 값을 읽는다
        if(number != null){
            sumOfValidNumbers += number //널에 대한 값을 확인한다
        }else{
            invalidNumbers++
        }
    }
    println("Sum Of Valid Numbers : $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}
 */

fun addValidNumbers(numbers: List<Int?>) {
    val validNumbers = numbers.filterNotNull()
    println("Sum Of Valid Numbers : ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}

fun <T> copyElements(source: Collection<T>,
                     target: MutableCollection<T>){
    for(item in source){
        target.add(item) //변경 가능한 target 컬렉션에 원소를 추가
    }
}

fun printInUppercase(list: List<String>){ //읽기 전용 파라미터를 선언
    println(CollectionUtils.uppercaseAll(list))//컬렉션을 변경하는 자바 함수를 호출
    println(list.first())//컬렉션이 변경됬는지 살펴본다
}