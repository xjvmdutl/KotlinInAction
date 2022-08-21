package ch11.invoke

class DependencyHandler {
    fun compile(coordinate: String) { //일반적인 명령형 API 정의
        println("Added dependency on $coordinate")
    }

    operator fun invoke(
        body: DependencyHandler.() -> Unit
    ) {// invoke를 정의해 DSL 스타일 API를 제공
        body() //this가 함수의 수신객체가 되므로 this.body()와 같다
    }
}

fun main() {
    val dependencies = DependencyHandler()
    dependencies.compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    dependencies{
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    }
}