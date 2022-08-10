package ch08

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


    println("ab1c".filter { it in 'a'..'z' }) //람다를 predicate 파라미터로 전달한다
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