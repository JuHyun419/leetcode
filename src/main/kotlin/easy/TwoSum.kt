package easy

/**
 * https://leetcode.com/problems/two-sum/description/
 */
class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..<nums.size - 1) {
            for (j in i + 1..<nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("not exist solution")
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, value ->
            val diff = target - value
            map[diff]?.let { return intArrayOf(it, index) }

            map[value] = index
        }

        throw IllegalArgumentException("not exist solution")
    }

}
