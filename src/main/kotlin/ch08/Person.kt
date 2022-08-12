package ch08

/*
data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?
)
 */
data class Person(val name: String, val age: Int)

/*
fun lookForAlice(people: List<Person>){
    for(person in people){
        if(person.name == "Alice"){
            println("Found!!")
            return
        }
    }
    println("Alice is not found") //people 안에 엘리스가 없으면 이 줄 출력
}
 */
/*
fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!!")
            return
        }
    }
    println("Alice is not found") //people 안에 엘리스가 없으면 이 줄 출력
}
 */
/*
fun lookForAlice(people: List<Person>) {
    people.forEach label@{ //람다 식 앞에 레이블을 붙힌다
        if (it.name == "Alice") {
            return@label //앞에서 정의한 레이블을 참조한다.
        }
    }
    println("Alice is not found") //이 줄은 항상 출력
}
 */
/*
fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            return@forEach //return@forEach는 람다식으로부터 반환
        }
    }
    println("Alice is not found") //이 줄은 항상 출력
}
 */
fun lookForAlice(people: List<Person>) {
    people.forEach(fun (person){ //람다 식 대식 무명 함수를 사용
        if(person.name == "Alice") return //return 은 가장 가까운 함수를 가리키고, 현재 위치에서 가장 가까운 함수는 무명함수이다
        println("${person.name} is not Alice")
    })
}