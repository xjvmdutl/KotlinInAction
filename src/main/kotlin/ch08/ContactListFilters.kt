package ch08
/*
class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
}
 */
/*
class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false
    fun getPredicate(): (Person) -> Boolean { //함수를 반환하는 함수를 정의
        val startsWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (!onlyWithPhoneNumber) {
            return startsWithPrefix //함수 타입의 변수를 반환
        }
        return {
            startsWithPrefix(it) && it.phoneNumber != null
        } //람다를 반환한다.
    }
}
 */