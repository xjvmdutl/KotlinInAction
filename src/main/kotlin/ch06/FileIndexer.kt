package ch06

import ch06.java.FileContentProcessor
import java.io.File

class FileIndexer :FileContentProcessor {
    override fun processContents(
        path: File?,
        binaryContents: ByteArray?,
        textContents: MutableList<String>?
    ) {
        //logic
    }
}