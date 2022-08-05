package ch04

open class RichButton : Clickable{
    fun disable(){} //해당 함수는 final이다. 하위 클래스가 이 메서드를 오버라이드 할 수 없다
    open fun animate(){} // 이 함수는 열려있다. 하위 클래스에서 메서드 오버라이드 가능하다
    //override fun click() {} // 이 함수는 열려있는 메서드를 오버라이드 한다(오버라이드한 메서드는 기본적으로 열려있다)
    final override fun click() {} // final 이 없는 override 메서드나 프로퍼티는 기본적으로 열려있다
}