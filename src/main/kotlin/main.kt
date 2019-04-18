import kotlinx.serialization.json.Json
import kotlinx.serialization.list

fun main() {

    val jsonData = Json.stringify(Person.serializer(), Person())
    val jsonList = Json.stringify(Person.serializer().list, listOf(Person(), Person("Hideyoshi", "Toyotomi")))
    println(jsonData)
    println(jsonList)

    val obj = Json.parse(Person.serializer(), """{"firstName":"Nobunaga", "lastName":"Oda", "age":20}""")
    val obj2 = Json.unquoted.parse(Person.serializer(), """{firstName:Nobunaga, lastName:Oda, age:20}""")
    println(obj)
    println(obj2)
}
