package ch10

import org.junit.Assert
import org.junit.Test

const val TEST_TIMEOUT = 100L

class MyTest {
    @Test
    fun testTrue(){ //@Test 어노테이션을 사용해 JUnit 프레임워크에게 이 메서드를 테스트로 호출하라고 지시한다.
        Assert.assertTrue(true)
    }

    @Test(timeout = TEST_TIMEOUT)
    fun testMethod(){
        //logic
    }
}

fun test(list: List<*>){
    @Suppress("UNCHECKED_CAST")
    val strings = list as List<String>
}