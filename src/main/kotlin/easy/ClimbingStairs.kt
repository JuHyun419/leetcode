package easy

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 */
class ClimbingStairs {

    fun climbStairs(n: Int): Int {
        if (n <= 2) return n

        var prev1 = 1
        var prev2 = 2

        for (i in 3..n) {
            val current = prev1 + prev2
            prev1 = prev2
            prev2 = current
        }

        return prev2
    }
}
