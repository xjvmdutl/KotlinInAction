package ch07

import java.beans.PropertyChangeListener
import java.math.BigDecimal
import java.time.LocalDate

fun main(args: Array<String>) {
    /*
    val p1 = Point( 10, 20)
    val p2 = Point( 30, 40)
    println(p1 + p2) //+로 계산하면 plus 함수가 호출된다
     */
    /*
    val p = Point(10, 20)
    println(p * 1.5)
     */
    //println('a' * 3)
    /*
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)
     */
    /*
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers)
     */
    /*
    val list = arrayListOf(1, 2)
    list += 3 //+=는 list 를 변경한다
    val newList = list + listOf(4, 5) //+는 두 리스트의 모든 원소를 포함하는 새로운 리스트를 반환한다
    println(list)
    println(newList)
     */
    /*
    val p = Point(10, 20)
    println(-p)
     */
    /*
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
     */
    /*
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
    println(null == Point(1, 2))
     */
    /*
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)
     */
    /*
    val p = Point(10, 20)
    println(p[1])
     */
    /*
    val p = MutablePoint(10, 20)
    p[1] = 42
    println(p)
     */
    /*
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)
     */
    /*
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10) //오늘 부터 10일짜리 범위 생성
    println(now.plusWeeks(1) in vacation) //특정 날짜가 날짜 범위 안에 들어가는지 검사
     */
    /*
    val n = 9
    println(0..(n + 1)) //괄호를 처서 명확하게 하자
    (0..n).forEach { print(it) } //범위의 메서드를 호출하기 위해서는 범위를 괄호로 둘러싸라
     */
    /*
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff){ //daysOff에 대응하는 iterator 함수가 있으면 daysOff에 대해 이터레이션한다
        println(dayOff)
    }
     */
    /*
    val p = Point(10, 20)
    val (x, y) = p //x,y 변수를 선언한 다음에 p의 여러 컴포넌트로 초기화한다.
    println(x)
    println(y)
     */
    /*
    val (name, ext) = splitFilename("example.kt") // 구조 분해 선언 구문을 사용해 데이터 클래스를 푼다
    println(name)
    println(ext)
     */
    /*
    val map = mapOf("Oracle" to "Java", "JetBrains" to "Kotlin")
    printEntries(map)
     */
    /*
    val foo =Foo()
    val oldValue = foo.p //내부에서 delegate.getValue(...)를 호출한다
    foo.p = newValue //내부에서 delegate.setValue(..., newValue)를 호출한다
     */
    /*
    val p = Person("Alice")
    p.emails
    p.emails
     */
    /*
    val p = Person("Dmitry", 34, 2000)
    p.addPropertyChangeListener( //프로퍼티 변경 리스너를 추가한다
        PropertyChangeListener { event ->
            println(
                "Property ${event.propertyName} changed " +
                        "from ${event.oldValue} to ${event.newValue}"
            )
        }
    )
    p.age = 35
    p.salary = 2100
     */
    val p = Person()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data){
        p.setAttribute(attrName, value)
    }
    println(p.name)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun <T> MutableCollection<T>.plusAssign(element: T) {
    this.add(element)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        //이 객체는 LocalDate 원소에 대한 Iterator를 구한다
        var current = start
        override fun hasNext(): Boolean =
            current <= endInclusive //compareTo 관례를 사용해 날짜를 비교한다

        //현재 날짜를 저장한 다음 날짜를 변경한다, 그 후 변경한 날짜를 반환한다
        override fun next(): LocalDate = current.apply {
            current = plusDays(1) //현재 날짜를 1일 뒤로 변경한다
        }

    }

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) { //루프 변수에 구조 분해 선언을 사용
        println("$key -> $value")
    }
}