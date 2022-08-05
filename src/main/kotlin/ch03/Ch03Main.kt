package ch03

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar : Char
    get() = get(length - 1)
    set(value: Char){
        this.setCharAt(length - 1, value)
    }
fun main(args: Array<String>) {
    /*
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "One", 7 to "Seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
     */

    /*
     val strings = listOf("first", "second", "fourteenth")
     println(strings.last())
     val numbers = setOf(1, 14, 2)
     println(numbers.max())
     */
    /*
    val list = listOf(1, 2, 3)
    println(list)
     */
    /*
    val list = listOf(1, 2, 3)
    //println(joinToString(list, "; ", "(", ")"))
    //println(joinToString(list, /* separator */"; ", /* prefix */"(", /* postfix */")"))
    //println(joinToString(list, separator = "; ", prefix = "(", postfix = ")"))
    println(joinToString(list, ", ", "", ""))
    println(joinToString(list))
    println(joinToString(list, "; "))
    println(joinToString(list, postfix = "; ", prefix = "#"))
     */
    //println("Kotlin".lastChar())
    //val c = "Kotlin".lastChar()
    //val tmpC = "Kotlin".last()
    //val list = listOf(1, 2, 3)
    //println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
    //println(listOf("One", "Two", "Three").join(" "))
    //println(listOf(1, 2, 3).join()) // 에러

    //val view: View = Button()
    //view.click()
    /*
    fun View.showOff() = println("I'm a View!")
    fun Button.showOff() = println("I'm a Button!")
    val view: View = Button()
    view.showOff()
     */
    /*
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
     */
    /*
    val strings: List<String> = listOf("first", "second", "fourteenth")
    strings.last()
    val numbers: Collection<Int> = setOf(1, 14, 2)
    numbers.max()
     */
    /*
    val list = listOf("args: ", *args)
    println(list)
     */
    //val map = mapOf(1 to "One", 7 to "Seven", 53 to "fifty-three")
    //println("12.345-6.A".split("\\.|-".toRegex()))
    //println("12.345-6.A".split(".", "-"))

    //val fileSplit = FileSplit()
    //fileSplit.parsePath("/Users/yole/kotlin-book/chapter.adoc")
   /* val kotlinLogo = """| //
                        .| //
                        .|/\"""
    println(kotlinLogo.trimMargin("."))*/
    saveUser(User(1, "", ""))
}
/*
fun <T> joinToString(
    collection: Collection<T>, separator: String, prefix: String, postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator) //첫 원소 구분자 안붙힌다
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
 */
/*
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator) //첫 원소 구분자 안붙힌다
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
*/

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator) //첫 원소 구분자 안붙힌다
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}
fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)