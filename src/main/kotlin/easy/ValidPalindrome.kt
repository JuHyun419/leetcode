package easy

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 */
class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {
        val letter = s.lowercase().filter { it.isLetterOrDigit() }

        return letter == letter.reversed()
    }
}

fun main() {
    val s = ValidPalindrome()
    println(s.isPalindrome("A man, a plan, a canal: Panama")) // true
    println(s.isPalindrome("race a car")) // false
}
