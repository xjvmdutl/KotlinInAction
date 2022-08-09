package ch07
/*
object Users: IdTable() { //객체는 데이터베이스 테이블에 해당한다
    val name = varchar("name", length=50).index() //프로퍼티는 테이블 칼럼에 해당
    val age = integer("age")
}
class User(id: EntityID) :Entity(id){ //각 User 인스턴스는 테이블에 들어있는 구체적인 엔티티에 해당
    var name: String by Users.name //사용자 이름은 데이터베이스 name 컬럼에 들어있다
    var age: Int by Users.age
}
 */
/*

class User(id: EntityID) :Entity(id){
    var name: String by Users.name //Users.name 은 name 프로퍼티에 해당하는 위임 객체다
    var age: Int by Users.age
}
 */