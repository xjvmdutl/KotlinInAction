package ch04

/*
data class Person(val name:String) {
    object NameComparator: Comparator<Person>{
        override fun compare(p1: Person, p2: Person): Int =
            p1.name.compareTo(p2.name)
    }
}
*/
/*
class Person(val name: String){
    companion object Loader{
        fun fromJSON(jsonText: String): Person = Person("JSON")
    }
}*/

class Person(val firstName: String, val lastName: String){
    companion object{ //비어 있는 동반객체 선언

    }
}

fun Person.Companion.fromJSON(json:String): Person = Person("FIRST", "LAST")
