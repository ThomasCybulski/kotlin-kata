import java.util.*

/**
 * @author tcybulsk
 */
fun getHelloString(): String {
    return "Hello, world!"
}

fun getHello2() {
    println("hello2")
}

fun main(args: Array<String>) {

    val list1 = ArrayList<Comparable<*>>()
    val list2 = ArrayList<Comparable<*>>()

    list1.add("xyz")
    list1.add("10")
    list1.add("11")

    list2.add(10)
    list2.add(12)

    println(getHelloString())
    getHello2()

    /**
     *
     */
    class Person(var name: String, var age: Int, var college: String, var email: String?) {
        fun isEligibleToVote(): Boolean {
            // If age is greater or equal to 18
            // return true
            return age >= 18
        }
    }

    var jake = Person("Jake Hill", 24, "Stephen's College", "jake.hill@example.com")

    jake.isEligibleToVote()

    println(jake.isEligibleToVote());
}



