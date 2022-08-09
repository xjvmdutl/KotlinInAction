package ch07

data class NameComponents(val name: String, val extension: String) //값을 저장하기 위한 데이터 클래스 선언
/*
fun splitFilename(fullName: String): NameComponents{
    val result = fullName.split('.', limit = 2)
    return NameComponents(result[0], result[1]) //함수에서 데이터 클래스의 인스턴스를 반환
}
 */

fun splitFilename(fullName: String): NameComponents{
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}