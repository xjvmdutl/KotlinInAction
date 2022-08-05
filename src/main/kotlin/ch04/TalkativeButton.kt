package ch04

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey")
    protected fun whisper() = println("Let's talk")
}
/*
fun TalkativeButton.giveSpeech() { //오류 public 맴버가 자시의 internal 수신 타입인 TalkativeButton 노출
    yell()// yell에 접근할 수 없다. -> yell은 TalkativeButton의 private 멤버이다
    whisper() //whisper에 접근할 수 없다 -> whisper는 TalkativeButton의 protected 멤버이다
}
 */