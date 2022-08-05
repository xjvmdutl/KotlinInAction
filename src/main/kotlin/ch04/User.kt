package ch04

import java.util.StringJoiner


/*
class User constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}
*/
/*
class User(_nickname: String) {
    val nickname = _nickname
}
*/
//class User(val nickname:String) //val은 파라미터에 상응하는 프로퍼티가 생성된다는 의미
//class User(val nickname:String, val isSubscribed: Boolean = true) //생성자 파라미터에 대한 디폴트값 제공
/*
open class User(val nickname: String)
class TwitterUser(nickname: String) : User(nickname)
 */
/*
interface User{
    val email: String
    val nickname: String
        get() = email.substringBefore('@')
}
 */
/*
class FacebookUser(val accountId:Int): User{
    override val nickname = getFacebookName(accountId)
}
class PrivateUser(override val nickname: String): User
class SubscribingUser(val email:String): User{
    override val nickname: String
        get() = email.substringBefore('@')
}
 */
/*
class User(val name: String){
    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value"""".trimIndent())
            field = value
        }
}
 */
/*
class User{
    val nickname: String
    constructor(email: String){
        nickname = email.substringBefore('@')
    }
    constructor(facebookAccountId: Int){
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(facebookAccountId: Int): String {
        return "FacebookID"
    }
}*/

class User private constructor(val nickname: String){
    companion object{ //동반 객체 선언
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
        private fun getFacebookName(facebookAccountId: Int): String {
            return "FacebookID"
        }
    }
}