package ch07

import javax.print.attribute.standard.MediaSize.Other

/*
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) : Point{ //plus라는 연산자 함수를 정의한다
        return Point(x + other.x, y + other.y) //좌표를 성분별로 더한 새로운 점을 반환한다.
    }
}
 */
class Point(val x: Int, val y: Int) {
    override fun equals(obj: Any?): Boolean {//Any에 정의된 메서드를 오버라이딩
        if (obj === this) return true //최적화 : 파라미터가 this와 같은 객체인지 살펴본다
        if (obj !is Point) return false //파라미터 타입을 검사한다
        return obj.x == x && obj.y == y //Point로 스마트 캐스트해서 x와 y 프로퍼티에 접근한다
    }
}

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Point.unaryMinus(): Point { //단항 minus함수는 파라미터가 없다
    return Point(-x, -y) //좌표에서 각 성분의 음수를 취한 새점을 반환
}

operator fun Point.get(index: Int): Int { //get 연산자 함수를 정의
    return when(index){
        //주어진 인덱스에 해당하는 좌표를 찾는다
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}
