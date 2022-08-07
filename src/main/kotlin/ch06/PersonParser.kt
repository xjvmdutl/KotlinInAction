package ch06

import ch06.java.DataParser

class PersonParser: DataParser<Person> {
    override fun parseData(
        input: String?,
        output: MutableList<Person>,
        errors: MutableList<String?>
    ) {
        //Logic
    }
}