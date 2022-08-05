package ch04

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.io.File
import java.time.Period

fun main(args: Array<String>) {
    //Button().click()
    /*
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
    */
    /*
    val hyun = User("현석")
    println(hyun.isSubscribed)

    val gye = User("계영", false)
    println(gye.isSubscribed)

    val hey = User("혜원", isSubscribed = false) //생성자 인자 중 일부에 대해 이름 지정 가능
    println(hey.isSubscribed)
     */
    /*
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
     */
    /*
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
     */
    /*
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
     */
    /*
    val client = Client("오현석", 4122)
    println(client)
    */
    /*
    val client1 = Client("오현석", 4122)
    val client2 = Client("오현석", 4122)
    println(client1 == client2)
    */
    /*
    val processed = hashSetOf(Client("오현석", 4122))
    println(processed.contains(Client("오현석", 4122)))
     */
    /*
    val lee = Client("이계영", 4122)
    println(lee.copy(postalCode = 4000))
     */
    /*
    val files = listOf(File("/Z"), File("/A"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
     */
    /*
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
     */
    //A.bar()
    /*
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
    */
    /*
    val person = Person.Loader.fromJSON("{name:'Dmity'}")
    println(person.name)
     */
}

/*
window.addMouseListener {
    object: MouseAdapter(){ //MouseAdapter를 확장하는 무명 객체
        override fun mouseClicked(e: MouseEvent) { //MouseAdapter의 메서드를 오버라이드
            //...
        }

        override fun mouseEntered(e: MouseEvent) {
            //...
        }
    }
}
*/



fun countClicks(window: Window) {
    var clickCount = 0
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            clickCount++
        }
    })
}
