package arrays

/**
 * https://leetcode.com/problems/move-zeroes/
 */
class Move_Zeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var nonZeroIndex = 0

        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i]
                nonZeroIndex++
            }
        }

        for (i in nonZeroIndex until nums.size) {
            nums[i] = 0
        }
    }
}

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    val m = Move_Zeroes()

    println(m.moveZeroes(nums))
}
