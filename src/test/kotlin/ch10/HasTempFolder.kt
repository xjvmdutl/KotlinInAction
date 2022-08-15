package ch10

import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class HasTempFolder {
    @get:Rule //프로퍼티가 아니라 게터에 애노테이션이 붙는다
    val folder = TemporaryFolder()

    @Test
    fun testUsingTempFolder(){
        val createdFile = folder.newFile("myfile.txt")
        val createdFolder = folder.newFolder("subfolder")
    }


}