package ch06

import ch06.java.StringProcessor

class StringPrinter: StringProcessor {
    override fun process(value: String) {
        println(value)
    }
}
class NullableStringPrinter: StringProcessor {
    override fun process(value: String?) {
        if(value != null){
            println(value)
        }
    }
}