package ch11

fun main() {
    /*
    //1
    val s = buildString {
        it.append("Hello, ")
        it.append("World")
    }
    println(s)
     */
    /*
    //2
    val s = buildString {
        this.append("Hello, ") //this 키워드는 StringBuilder 인스턴스를 가리킨다.
        append("World")//this를 생략해도 묵시적으로 StringBuilder 인스턴스가 수신 객체로 취급
    }
    println(s)
     */
    val appendExcl: StringBuilder.() -> Unit = {//appendExcl은 확장 함수 타입의 값
        this.append("!")
    }
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl() //appendExcl을 확장함수처럼 호출
    println(stringBuilder)
    println(buildString(appendExcl))
}

/*
// 1
fun buildString(
    builderAction: (StringBuilder) -> Unit //함수 타입인 파라미터 정의
): String{
    val sb = StringBuilder()
    builderAction(sb) //람다 인자로 StringBuilder 인스턴스 넘긴다.
    return sb.toString()
}
*/
/*
fun buildString(
    builderAction: StringBuilder.() -> Unit //수신 객체가 있는 함수 타입의 파라미터 선언
): String{
    val sb = StringBuilder()
    sb.builderAction() //StringBuilder 인스턴스를 람다의 수신객체로 넘긴다
    return sb.toString()
}
 */
fun buildString(builderAction: StringBuilder.() -> Unit): String =
    StringBuilder().apply(builderAction).toString()