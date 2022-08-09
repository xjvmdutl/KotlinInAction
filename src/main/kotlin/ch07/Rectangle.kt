package ch07

data class Rectangle(val upperLeft: Point, val lowerRight: Point)
operator fun Rectangle.contains(p: Point): Boolean{
    return p.x in upperLeft.x until lowerRight.x && //범위를 만들고 x 좌표가 그 범위 안에 있는지 검사
        p.y in upperLeft.y until lowerRight.y //util함수를 통해 열린 범위 생성
}