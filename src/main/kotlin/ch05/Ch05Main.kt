package ch05

import java.io.File
import java.lang.StringBuilder
import javax.naming.Context

fun main(args: Array<String>) {
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldSet(people)
     */
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    //println(people.maxBy { it.age })// 나이 프로퍼티를 비교해서 사용할 값을 돌려주는 함수를 인자로 받는다
    people.maxBy(Person::age)
     */
    /*
    val sum = {x: Int, y: Int -> x + y}
    println(sum(1, 2))
    //{ println(42) }
     */
    //run{println(42)}
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    //println(people.maxBy({p:Person -> p.age}))
    //println(people.maxBy() { p:Person -> p.age })
    println(people.maxBy{ p:Person -> p.age })
     */
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    //val names = people.joinToString(separator = " ", transform = { p:Person -> p.name})
    val names = people.joinToString(" "){ p:Person -> p.name}
    println(names)
     */
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    //people.maxBy { p:Person -> p.age } //파라미터 타입 명시
    //people.maxBy { p -> p.age }//파라미터 타입을 생략 (컴파일러가 추론)
    people.maxBy { it.age }
     */
    /*
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y ...")
        x + y
    }
    println(sum(1, 2))
    */
    /*
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
     */
    /*
    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
     */
    /*
    val age = Person::age
    println(age)
    */
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.maxBy(Person::age)
    people.maxBy { p -> p.age }
    people.maxBy { it.age }
     */
    //run(::salute)
    /*
    val action = {person:Person, message: String ->
        sendEmail(person, message)
    }
    val nextAction = ::sendEmail
    println(nextAction)
    */
    /*
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)
    */
    /*
    val predicate = Person::isAdult
    println(predicate)
    */
    /*
    val p = Person("Dmitry", 34)
    val personsAgeFunction = Person::age
    println(personsAgeFunction(p))

    val dmitrysAgeFunction = p::age
    println(dmitrysAgeFunction())
    */
    /*
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 }) //짝수만 남는다

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age > 30 }) //30살 이상인 사람만 필요
     */
    /*
    val list = listOf(1, 2, 3, 4)
    println(list.map { it * it })
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.map { it.name })
    println(people.map(Person::name))
     */
    /*
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    //println(people.filter { it.age > 30 }.map(Person::name))
    //println(people.filter { it.age == people.maxBy(Person::age)!!.age })
    val maxAge = people.maxBy(Person::age)!!.age
    println(people.filter { it.age == maxAge })
    */
    /*
    val numbers = mapOf(0 to "Zero", 1 to "One")
    println(numbers.mapValues { it.value.toUpperCase() })
     */
    /*
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))

    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })
    */
    /*
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.count(canBeInClub27))
    */

    /*
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    println(people.find(canBeInClub27))
    */

    /*
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29),
        Person("Carol", 31))
    println(people.groupBy { it.age })

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
    */
    /*
    val books = listOf(
        Book("Thursday Next", listOf("Jasper Fforde")),
        Book("Mort", listOf("Terry Pratchett")),
        Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet()) //books 컬렉션에 있는 책을 쓴 모든 저자의 집합

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
     */
    /*
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29),
        Person("Carol", 31))
    println(people.map(Person::name).filter { it.startsWith("A") })
    */
    /*
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29),
        Person("Carol", 31))
    println(people.asSequence()
        .map(Person::name)
        .filter{it.startsWith("A")}
        .toList())
     */
    /*
    //최종연산이 없는 코드 -> 아무내용도 출력되지 않는다.
    listOf(1, 2, 3, 4).asSequence()
        .map{ print("map($it) "); it * it }
        .filter {  print("filter($it) "); it % 2== 0 }

    listOf(1, 2, 3, 4).asSequence()
        .map{ print("map($it) "); it * it }
        .filter {  print("filter($it) "); it % 2== 0 }
        .toList() //최종연산이 적용된 코드
     */
    //println(listOf(1, 2, 3, 4).asSequence().map { it * it }.find { it > 3 })
    /*
    val people = listOf(
        Person("Alice", 31),
        Person("Bob", 29),
        Person("Carol", 31),
        Person("Dan", 21)
    )
    println(people.asSequence().map(Person::name).filter { it.length < 4 }.toList())
    println(people.asSequence().filter { it.name.length < 4 }.map(Person::name).toList())
     */
    /*
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())
    */
    /*
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
     */
    //postponeComputation(1000) { println(42) }
    /*
    postponeComputation(1000, object: Runnable{
        override fun run() {
            println(42)
        }
    })
    */
    //handleComputation()
    //createAllDoneRunnable().run()
    println(alphabet())
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {//각 원소에 대해 수행할 작업을 람다로 받는다
        println("$prefix $it") //람다 안에서 함수의 prefix 파라미터를 사용
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++  //람다 안에서 람다 밖의 변수를 변경
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

/*
fun tryToCountButtonClicks(button: Button): Int{
    var clicks = 0
    button.onClick(clicks++)
    return clicks
}
*/

fun salute() = println("Salute!")

fun sendEmail(person: Person, message: String): String {
    return "sendEmail"
}

fun Person.isAdult() = age >= 21

fun File.isInsideHiddenDirectory() = generateSequence(this) { it.parentFile }.any { it.isHidden}

fun postponeComputation(delay: Int, computation: Runnable){
    computation.run()
}
val runnable = Runnable { println(42) }

fun handleComputation() {
    postponeComputation(1000, runnable)
}

fun handleComputation(id: String) {
    /*
    postponeComputation(1000) {
        println(id)
    }
     */
}


fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

/*
fun alphabet(): String{
    val result = StringBuilder()
    for (letter in 'A'..'Z'){
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}
*/
/*
fun alphabet(): String{
    val stringBuilder = StringBuilder()
    return with(stringBuilder){//메서드를 호출하려는 수신객체를 지정
        for (letter in 'A'..'Z'){
            this.append(letter)//this 를 명시해서 앞에서 지정한 수신객체의 메서드를 호출
        }
        append("\nNow I know the alphabet!") //this 생략 가능
        this.toString()//람다에서 값 반호나
    }
}
*/
/*
fun alphabet(): String{
    return with(StringBuilder()){
        for (letter in 'A'..'Z'){
            append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
    }
}
*/

/*
fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()
*/

fun alphabet() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}