package easy

import kotlin.math.abs

/**
 * https://leetcode.com/problems/score-of-a-string/description/
 */
class ScoreOfAString {

    fun scoreOfString(s: String): Int =
        (0 until s.lastIndex).sumOf { i -> abs(s[i].code - s[i + 1].code) }
}
