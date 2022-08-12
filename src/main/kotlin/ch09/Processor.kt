package ch09

/*
class Processor<T> {
    fun process(value: T){
        value?.hashCode() //value는 널이 될 수 있다.따라서 안전한 호출을 해야한다
    }
}
 */
class Processor<T : Any> { //null 이 될 수 없는 타입 상한을 지정한다
    fun process(value: T){
        value.hashCode() //T 타입의 value는 null 이 될 수 없다
    }
}