package ch07

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/*
class Person(
    val firstName: String, val lastName: String
) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, //인자로 받은 함수를 차례로 호출하면서 값을 비교한다
            Person::lastName, Person::firstName)
    }
}
 */
/*
class Person(val name: String){
    /*
    private var _emails: List<Email>? = null //데이터를 저장하고 emails의 위임 객체 역할을 하는 _emails 프로퍼티
    val emails: List<Email>
    get(){
        if(_emails == null){
            _emails = loadEmails(this) //최초 접근 시 이메일을 가져온다
        }
        return _emails!! //저장해 둔 데이터가 있으면 그 데이터를 반환한다
    }
     */
    val emails by lazy { loadEmails(this) }
}
 */
/*
class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware(){
    var age: Int = age
        set(newValue){
            val oldValue = field //뒷받침하는 필드에 접근할 때 field 식별자를 사용한다
            field = newValue
            changeSupport.firePropertyChange( //프로퍼티 변경을 리스너에게 통지한다
                "age", oldValue, newValue)
        }
    var salary: Int = salary
        set(newValue){
            val oldValue = field
            field = newValue
            changeSupport.firePropertyChange(
                "salary", oldValue, newValue)
        }
}
 */
/*
class Person(val name: String, age: Int, salary: Int) : PropertyChangeAware(){
    val _age = ObservableProperty("age", age, changeSupport)
    var age: Int
        get() = _age.getValue()
        set(value){ _age.setValue(value) }
    val _salary = ObservableProperty("salary", salary, changeSupport)
    var salary: Int
        get() = _salary.getValue()
        set(value){ _salary.setValue(value) }
}
 */
/*
class Person(val name:String, age: Int, salary: Int
): PropertyChangeAware(){
    var age: Int by ObservableProperty(age, changeSupport)
    var salary: Int by ObservableProperty(salary, changeSupport)
}
 */
/*
class Person(val name:String, age: Int, salary: Int
): PropertyChangeAware(){
    private val observer = {
        prop:KProperty<*>, oldValue: Int, newValue: Int ->
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}
 */
/*
class Person {
    //추가 정보
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    //필수 정보
    val name: String
    get() = _attributes["name"]!! //수동으로 맵에서 정보를 꺼낸다
}
 */

class Person {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes//위임 프로퍼티로 맵을 사용한다
}