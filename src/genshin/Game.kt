package genshin

import java.io.File
import kotlin.random.Random

val rand = genshin.util.Random(40)

fun main() {

    val text = File("stats.txt").readText()

    val lines = text.split(" ")

    println(lines)


}