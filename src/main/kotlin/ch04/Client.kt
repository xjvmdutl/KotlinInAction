package ch04
/*
class Client(val name: String, val postalCode:Int){
    override fun toString(): String = "Client(name=$name, postalCode=$postalCode)"
    override fun equals(other: Any?): Boolean { //Any는 Object에 대응하는 클래스로 코틀린의 모든 클래스의 최상위 클래스다
        if(other == null || other !is Client){
            return false
        }
        return name == other.name && postalCode == other.postalCode
    }
    override fun hashCode(): Int =
        name.hashCode() * 31 + postalCode
}
 */
data class Client(val name: String, val postalCode: Int)

/*
class Client(val name: String, val postalCode: Int){
    fun copy(name: String = this.name,
             postalCode: Int = this.postalCode) =
        Client(name, postalCode)
}*/
