package ch03

import java.security.cert.CertPath

class FileSplit {
    /*
    fun parsePath(path: String){
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")
        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")
        println("dir: $directory, name: $fileName, ext: $extension")
    }
     */
    fun parsePath(path: String){
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
        if(matchResult != null){
            val (directory, fileName, extension ) = matchResult.destructured
            println("dir: $directory, name: $fileName, ext: $extension")
        }
    }
}