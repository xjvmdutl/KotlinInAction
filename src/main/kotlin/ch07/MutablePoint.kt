package ch07

data class MutablePoint(var x: Int, var y: Int)
operator fun MutablePoint.set(index: Int, value: Int){ //set 연산자 함수를 정의
    //주어진 인덱스에 해당하는 좌표를 변경
    when(index){
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}