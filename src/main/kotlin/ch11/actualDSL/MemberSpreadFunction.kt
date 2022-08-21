package ch11.actualDSL

import org.jetbrains.exposed.sql.Table

/*
open class Table {
    fun integer(name: String) = Column<Int>()
    fun varchar(name: String, length: Int) = Column<String>()

    fun <T> Column<T>.primaryKey(): Column<T> = TODO()
    // 자동 증가는 int만 되도록 제한을 건다
    fun Column<Int>.autoIncrement(): Column<Int> = TODO()
}
class Column<T>
 */
object Country: Table(){
    val id = integer("id").autoIncrement().primaryKey()
    val name = varchar("name", 50)
}


fun main() {


}