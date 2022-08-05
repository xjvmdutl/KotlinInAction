package ch03

class User(val id: Int, val name: String, val address: String) {

}
/*fun saveUser(user: User){
    if(user.name.isEmpty()){
        throw IllegalArgumentException("Can't save user ${user.id} : empty name")
    }
    if(user.address.isEmpty()){
        throw IllegalArgumentException("Can't save address ${user.id} : empty address")
    }
    //user 저장
}*/

/*
fun saveUser(user: User){
    fun validate(user: User, value: String, fileName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id} : empty $fileName")
        }
    }
    //user 저장
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

*/

/*
fun saveUser(user: User){
    fun validate(value: String, fileName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id} : empty $fileName")
        }
    }
    //user 저장
    validate(user.name, "Name")
    validate(user.address, "Address")
}*/
fun User.validateBeforSave(){
    fun validate(value: String, fileName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user $id : empty $fileName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User){
    user.validateBeforSave()

    //user 저장

}