package easy

/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
 */
class CountTheNumberOfConsistentStrings {

    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var count = 0

        for (word in words) {
            var consistentString = true

            for (char in word) {
                if (!allowed.contains(char)) {
                    consistentString = false
                    break
                }
            }

            if (consistentString) count++
        }

        return count
    }

    fun countConsistentStrings2(allowed: String, words: Array<String>): Int {
        val allowedSet = allowed.toSet()

        return words.count { word -> word.all { it in allowedSet } }
    }
}
