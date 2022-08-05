package ch02

import java.util.TreeMap

class MapExample {
    private val binaryReps = TreeMap<Char, String>()
    fun iterator(){
        for(c in 'A' .. 'F'){
            val binary = Integer.toBinaryString(c.toInt())
            binaryReps[c] = binary
        }
        for((letter, binary) in binaryReps){
            println("$letter = $binary")
        }
    }

    fun listIterator(){
        val list = arrayListOf("10", "11", "1001")
        for((index, element) in list.withIndex()){
            println("$index: $element")
        }
    }
}