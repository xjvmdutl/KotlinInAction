package ch11

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>() //모든 중첩 태그를 저장한다

    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()//자식 태그를 초기화한다
        children.add(child)//자식 태그에 대한 참조를 저장한다
    }

    override fun toString() =
        "<$name>${children.joinToString("")}</$name>"//결과 HTML을 문자열로 반환한다
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init) //TR태그 인스턴스를 새로 만들고, 초기화한 다음 TABLE 태그의 자식으로 등록한ㄷ
}
class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)//TD태그의 새 인스턴스를 만들어서 TR 태그의 자식으로 등록한다
}
class TD : Tag("td")

fun createTable() = table {
    tr {
        td { }
    }
}

fun createSimpleAnotherTable() = table {
    for(i in 1..2) {
        tr {//tr이 호출될 때마다 매번 새 TR 태그가 생기고, TABLE 자식으로 등록된다.
            td { }
        }
    }
}

fun main() {
    //println(createTable())
    println(createSimpleAnotherTable())
}