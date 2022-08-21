package ch11

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun main() {
    println(createSimpleTable())
}

/*
fun createSimpleTable() = createHTML()
    .table {
        tr {
            td { +"cell" }
        }
    }
 */

fun createSimpleTable() = createHTML()
    .table {
        (this@table).tr { //this@table의 타입은 TABLE 이다
            (this@tr).td {  //this@tr의 타입은 TR이다
                +"cell" // 묵시적 수신 객체로 this@td을 사용할 수 있고 그 타입은 TD다
            }
        }
    }