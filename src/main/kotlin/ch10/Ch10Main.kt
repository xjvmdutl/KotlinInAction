package ch10

fun main(args: Array<String>) {
}

@Deprecated("Use removeAt(index) instead", //더 이상 사용하지 않거나 권장되지 않는 메서드에 붙이는 애노테이션
    ReplaceWith("removeAt(index)")) //해당 파라미터를 통해 옛 버전을 대신할 수 있는 패턴을 제시가능
fun remove(index:Int){
    //logic
}