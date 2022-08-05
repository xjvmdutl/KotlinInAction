package ch04
/*
class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}
 */
/*
class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {
        /* ... */
    }
    class ButtonState: ch04.State{
        /* ... */
    }
}
 */
open class Button //인자가 없는 디폴트 생성자가 만들어진다
class RadioButton: Button() //Button클래스를 상속한 하위 클래스는 반드시 Button을 생성자를 호출해야한다