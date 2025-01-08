package easy

/**
 * https://leetcode.com/problems/palindrome-number/
 */
class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false

        return x.toLong() == x.toString().reversed().toLong()
    }

    fun isPalindrome2(x: Int): Boolean {
        if (x < 0) return false

        val str = x.toString()

        return str == str.reversed()
    }
}

fun main() {
    val p = PalindromeNumber()

    // true
    println(p.isPalindrome(121))
    println(p.isPalindrome2(121))

    // false
    println(p.isPalindrome(-121))
    println(p.isPalindrome2(10))
}
