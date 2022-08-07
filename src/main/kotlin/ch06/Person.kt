package ch06
/*
class Person(val name: String, val company: Company?) {

}
class Company(val name: String, val address: Address?) {

}

class Address(
    val streetAddress: String, val zipCode: Int,
    val city: String, val country: String
) {

}

fun Person.countryName(): String {
    val country = this.company?.address?.country //여런 안전한 호출 연산자를 연쇄해 사용
    return if (country != null) country else "Unknown"
}

fun printShippingLabel(person: Person) {
    // 주소가 없으면 예외 발생
    val address = person.company?.address ?: throw IllegalArgumentException("No address")

    with(address){  //address 는 null이 아니다
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}
 */
/*
class Person(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person ?: return false //타입이 서로 일치하지 않으면 false 반환
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName //안전한 캐스트를 하고 나면 otherPerson이 Person 타입으로 스마트 캐스트 된다
    }

    override fun hashCode(): Int =
        firstName.hashCode() * 37 + lastName.hashCode()
}
 */
data class Person(val name:String, val age:Int? = null){
    fun isOlderThan(other: Person): Boolean? {
        if(age == null || other.age == null){
            return null
        }
        return age > other.age
    }
}
