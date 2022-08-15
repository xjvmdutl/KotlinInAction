package ch09

import kotlin.reflect.KClass

interface FieldValidator<in T> {//T에 대해 반공변인 인터페이스를 선언
    fun validate(input: T): Boolean //T를 인 위치에만 사용한다(이 메서드는 T 타입의 값을 소비한다)
}

object DefaultStringValidator: FieldValidator<String>{
    override fun validate(input: String): Boolean = input.isNotEmpty()
}

object DefaultIntValidator: FieldValidator<Int>{
    override fun validate(input: Int): Boolean = input >= 0
}
object Validators{
    private val validators = //앞 예제와 같은 맵을 사용하지만 외부에서 접근 불가능
        mutableMapOf<KClass<*>, FieldValidator<*>>()
    fun <T: Any> registerValidator(
        kClass: KClass<T>, fieldValidator: FieldValidator<T>){
        validators[kClass] = fieldValidator //어떤 클래스와 검증기가 타입이 맞아 떨어지는 경우에만 그 클래스와 검증기 정보를 맵에 키/값 쌍으로 넣는다
    }

    @Suppress("UNCHECKED_CAST") //FieldValidator<T> 캐스팅이 안전하지 않다는 경고를 무시한다.
    operator fun <T: Any> get(kClass: KClass<T>): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
}