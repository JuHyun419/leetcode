package easy

/**
 * https://leetcode.com/problems/length-of-last-word/description/
 */
class LengthOfLastWord {

    fun lengthOfLastWord(s: String) = s.trim().split("\\s+".toRegex()).last().length

    fun lengthOfLastWord2(s: String) = s.split(" ")
        .last { it.isNotEmpty() }
        .length

}

fun main() {
    val s = LengthOfLastWord()
    println(s.lengthOfLastWord("   fly me   to   the moon  ")) // 4
    println(s.lengthOfLastWord("luffy is still joyboy")) // 6
}
