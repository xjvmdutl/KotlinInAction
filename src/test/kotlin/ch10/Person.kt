package kotlininaction
/*
import ru.yole.jkid.CustomSerializer
import ru.yole.jkid.DeserializeInterface
import ru.yole.jkid.JsonExclude
import ru.yole.jkid.JsonName
import ru.yole.jkid.deserialization.deserialize
import ru.yole.jkid.examples.customSerializerTest.DateSerializer
import ru.yole.jkid.serialization.serialize
import java.util.Date
 */

/*
data class Person(
    @JsonName("name") val firstName: String,
    @JsonExclude val age: Int
)
 */
/*
interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company
data class Person(
    val name: String,
    @DeserializeInterface(CompanyImpl::class) val company: Company
)
 */
/*
data class Person(
    val name: String,
    @CustomSerializer(DateSerializer::class) val birthDate: Date
)
fun main(args: Array<String>) {
    /*
    val person = Person("Alice", 29)
    println(serialize(person))
    val json = """{"name": "Alice", "age": 29}"""
    println(deserialize<Person>(json))
     */
}
 */