package ch05

data class Person(val name: String, val age: Int)

fun findTheOldSet(people: List<Person>) {
    var maxAge = 0 //가장 많은 나이
    var theOldSet: Person? = null
    for (person in people) {
        if (person.age > maxAge) { //현재까지 발견한 최 연장자보다 나이가 많은사람을 찾으면 최댓값 변경
            maxAge = person.age
            theOldSet = person
        }
    }
    println(theOldSet)
}