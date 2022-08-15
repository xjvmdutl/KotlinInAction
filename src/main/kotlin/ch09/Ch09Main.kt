package ch09

//import sun.jvm.hotspot.oops.CellTypeState.value
import java.security.CodeSource
import java.util.*
import java.util.function.BiPredicate
import javax.print.attribute.standard.Destination
import kotlin.reflect.KClass

fun main(args: Array<String>) {
    /*
    val authors = listOf("Dmitry", "Svetlana") //타입인자추론
    //val readers: MutableList<String> = mutableListOf() //변수 타입을 지정
    val readers = mutableListOf< String>()//변수를 만드는 함수의 인자를 지정
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
    /*
    if(value is List<*>){
        //...
    }
     */
    //printSum(listOf(1,2,3))
    /*
    printSum(setOf(1, 2, 3)) //집합은 리스트가 아니므로 예외가 발생한다
    printSum(listOf("a", "b", "c")) // as? 캐스팅은 성공하지만 나중에 다른 예외가 발생한다
     */
    /*
    println(isA<String>("abc"))
    println(isA<String>(123))
     */
    /*
    val items = listOf("One", 2, "three")
    println(items.filterIsInstance<String>())
     */
    /*
    //val serviceImpl = ServiceLoader.load(Service::class.java) //표준 자바 API인 ServiceLoader를 사용해 서비스를 읽어 온다.
    val serviceImpl = loadService<Service>()
     */
    //printContents(listOf("abc", "bac"))
    /*
    val strings = mutableListOf("abc", "bac")
    addAnswer(strings) //이 줄이 컴파일 된다면
    println(strings.maxBy { it.length })//실행 시점에 예외가 발생할 것이다.
     */
    /*
    val s: String = "abc"
    val t: String? = s //String이 String?의 하위 타입이므로 이 대입은 합법적
     */
    /*
    val anyComparator = Comparator<Any>{
        e1, e2 -> e1.hashCode() - e2.hashCode()
    }
    val strings = listOf("1", "3", "2")
    strings.sortedWith(anyComparator) // 문자열과 같은 구체적인 타입의 객체를 비교하기 위해 모든 객체를 비교하는 Comparator를 사용할 수 있다.
     */
    /*
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems) //Int가 Any의 하위 타입이므로 해당 함수를 호출할 수 있다.
    println(anyItems)
     */
    /*
    val list: MutableList<out Number> = mutableListOf(1, 2, 3)
    list.add(42)
     */
    /*
    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements: MutableList<*> = //MutableList<Any?> != MutableList<*>
        if(Random().nextBoolean())
            list
        else
            chars
    //unknownElements.add(42) //컴파일 오류
    println(unknownElements.first()) //원소를 가져와도 안전, first는 Any? 타입의 원소를 반환하기 때문
     */
    //printFirst(listOf("Svetlana", "Dmitry"))
    /*
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    //validators[String::class].validate("")
    //validators[String::class]!!.validate("")
    //val stringValidator = validators[String::class] as FieldValidator<String> //Warning: unchecked cast
    val stringValidator = validators[Int::class] //검증기를 잘못 가져왔지만 컴파일, 타입캐스팅시 아무 문제 없다
            as FieldValidator<String>
    stringValidator.validate("")//검증기를 사용할떄 비로소 오류 발생
     */
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)
    println(Validators[String::class].validate("kotlin"))
    println(Validators[Int::class].validate(42))
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

/*
fun printSum(c: Collection<*>){
    val intList = c as? List<Int> //여기서 unchecked cast: List<*> to List<Int> 경고
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}
 */

fun printSum(c: Collection<Int>){
    if(c is List<Int>){ //이 검사는 올바르다
        println(c.sum())
    }
}
//fun <T> isA(value: Any) = value is T

inline fun <reified T> isA(value: Any) = value is T //이코드는 컴파일이 된다.

inline fun <reified T> loadService(): ServiceLoader<T>? { //타입 파라미터를 reified 로 표시한다
    return ServiceLoader.load(T::class.java) //T::class 로 타입 파라미터의 클래스를 가져온다
}

fun printContents(list: List<Any>){
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>){
    list.add(42)
}
/*
fun test(i: Int){
    val n: Number = i //Int가 Number의 하위타입이어서 컴파일된다
    fun f(s: String){ /* logic */}
    f(i)//Int가 String의 하위타입이 아니어서 컴파일되지 않는다
}
 */
/*
fun <T> copyData(source: MutableList<T>,
                 destination: MutableList<T>){
    for(item in source){
        destination.add(item)
    }
}
 */
/*
fun <T: R, R> copyData(source: MutableList<T>, //source 원소 타입은 destination 원소타입의 하위 타입이어야 한다
                        destination: MutableList<R>){
    for(item in source){
        destination.add(item)
    }
}
 */
/*
fun <T> copyData(source: MutableList<out T>, //out 키워드를 타입을 사용하는 위치 앞에 붙이면 T 타입을 in 위치에 사용하는 메서드를 호출하지 않는다는 뜻이다
                       destination: MutableList<T>){
    for(item in source){
        destination.add(item)
    }
}
 */

fun <T> copyData(source: MutableList<T>,
                 destination: MutableList<in T>){ //원본 리스트 원소 타입의 상위 타입을 대상 리스트 원소 타입으로 허용
    for(item in source){
        destination.add(item)
    }
}

/*
fun printFirst(list: List<*>){ //모든 리스트를 인자로 받을 수 있다
    if(list.isNotEmpty())//isNotEmpty() 에서는 제네릭 타입 파라미터를 사용하지 않는다
        println(list.first()) //first()는 이제 Any? 를 반환하지만 여기서는 그 타입만으로 충분
}
 */
fun <T> printFirst(list: List<T>){ //이경우에도 모든 리스트를 인자로 받을 수 있다.
    if(list.isNotEmpty())
        println(list.first()) //이제 first()는 T 타입의 값을 반환
}