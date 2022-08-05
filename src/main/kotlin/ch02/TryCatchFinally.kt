package ch02

import java.io.BufferedReader

class TryCatchFinally {
    /*
    fun readNumber(reader: BufferedReader) : Int? {
        try {
            val line = reader.readLine()
            return Integer.parseInt(line)
        }catch (e: java.lang.NumberFormatException){
            return null
        }finally {
            reader.close()
        }
    }

     */
    fun readNumber(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())
        }catch (e: java.lang.NumberFormatException){
            return
        }
        println(number)
    }

}