package ch11.invoke

class Greeter(val greeting: String) {
    operator fun invoke(name: String){ //Greeter 안에 invoke 메서드를 정의
        println("$greeting, $name")
    }
}
fun main() {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry") //Greeter 인스턴스를 함수처럼 호출한다
}