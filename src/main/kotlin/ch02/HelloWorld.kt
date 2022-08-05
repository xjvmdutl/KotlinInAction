package ch02

import ch02.geometry.shapes.createRandomRectangle
import java.io.BufferedReader
import java.io.StringReader

fun main(args: Array<String>) {
    /*
    println("Hello, world");

    val name = if (args.size > 0) args[0] else "kotlin";
    println("Hello, $name"); //문자열 템플릿, Bob을 인자로 넘기면 Hello, Bob 아무 인자도 안넘기면 Hello, Kotlin 출력

    if(args.size > 0 ){
        println("Hello, ${args[0]}!"); //복잡한 식도 중괄호로 둘러싸써 템플릿안에 넣을수 있다.
    }
    println("Hello, ${if(args.size > 0) args[0] else "someone"}!")
     */
    /*
    val person = Person("Bob", true);
    println(person.name);
    println(person.isMarried);
     */
    /*
    val rectangle = Rectangle(41, 43);
    println(rectangle.isSquare);
     */
    //println(createRandomRectangle().isSquare);
    //println(Color.BLUE.rgb())
    //val wh = When();
    //println(wh.getMnemonic(Color.BLUE))
    //println(wh.getWarmth(Color.ORANGE))
    //println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    //println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))

    //val fizzBuzz = FizzBuzz();
    /*
    for(i in 1..100){
        print(fizzBuzz.fizzBuzz(i))
    }
     */
    /*
    for(i in 100 downTo 1 step 2){
        print(fizzBuzz.fizzBuzz(i))
    }
     */
    /*
    val mapExample = MapExample()
    mapExample.iterator()
     */
    val reader = BufferedReader(StringReader("not a number"))

    val tryCatchFinally = TryCatchFinally();
    tryCatchFinally.readNumber(reader)
}