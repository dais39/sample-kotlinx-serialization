import kotlinx.serialization.Serializable

@Serializable
data class Person(
    private val firstName: String = "Ieyasu",
    private val lastName: String = "Tokugawa",
    private val age: Int = 20
)
