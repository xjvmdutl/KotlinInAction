package ch10

import kotlin.reflect.full.*
import kotlin.reflect.KFunction2

var counter = 0

fun main(args: Array<String>) {
    /*
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin //KClass<Person>의 인스턴스를 반환한다.
    println(kClass.simpleName)
    kClass.memberProperties.forEach {
        println(it.name)
    }
     */
    /*
    val kFunction = ::foo
    kFunction.call(42)
     */
    /*
    val kFunction:KFunction2<Int, Int, Int> = ::sum
    println(kFunction.invoke(1, 2) + kFunction(3, 4))
    //kFunction(1) //Error : No value passed for parameter p2
     */
    /*
    val kProperty = ::counter
    kProperty.setter.call(21) //리플렉션 기능을 통해 세터를 호출하면서 21을 인자로 넘긴다
    println(kProperty.get()) //get을 호출해 프로퍼티 값을 가져온다
     */
    val person = Person("Alice", 29)
    val memberProperty = Person::age
    println(memberProperty.get(person))
}

fun foo(x: Int) = println(x)

fun sum(x: Int, y: Int) = x + y
@Deprecated(
    "Use removeAt(index) instead", //더 이상 사용하지 않거나 권장되지 않는 메서드에 붙이는 애노테이션
    ReplaceWith("removeAt(index)")
) //해당 파라미터를 통해 옛 버전을 대신할 수 있는 패턴을 제시가능
fun remove(index: Int) {
    //logic
}
//fun serialize(obj: Any): String = buildString { serializeObject(obj) }

/*
private fun StringBuilder.serializeObject(x: Any){
    append(x)
}
 */
/*
private fun StringBuilder.serializeObject(obj: Any){
    val kClass = obj.javaClass.kotlin //객체의 class를 받는다
    val properties = kClass.memberProperties //클래스의 모든 프로퍼티를 받는다

    properties.joinToString(
        this, prefix = "{", postfix = "}"){prop ->
        serializeString(prop.name)//프로퍼티 이름을 얻는다
        append(": ")
        serializePropertyValue(prop.get(obj)) //프로퍼티 값을 얻는다
    })
}
 */