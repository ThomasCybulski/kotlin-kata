import java.util.*

/**
 * A simple object.
 *
 * @author tcybulsk
 */
class Kassenbuch {

    var listDate = ArrayList<Comparable<*>>()
    var listArt = ArrayList<Comparable<*>>()
    var listBrutto = ArrayList<Comparable<*>>()
    var listKasse = ArrayList<Comparable<*>>()

    fun addBuchung(date: String, art: String, brutto: Float, kasse: Float) {
        listDate.add(date)
        listArt.add(art)
        listBrutto.add(brutto)
        listKasse.add(kasse)
    }

}

fun main(args: Array<String>) {


}


