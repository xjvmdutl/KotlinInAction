package ch04

interface JSONFactory<T> {
    fun fromJSON(jsonText: String) : T
}
/*

class Person(val name: String){
    companion object : JSONFactory<Person>{
        override fun fromJSON(jsonText: String): Person = Person("JSON")
    }
}*/
