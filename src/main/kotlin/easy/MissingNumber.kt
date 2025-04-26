package easy

/**
 * https://leetcode.com/problems/missing-number/description/ (268)
 */
class MissingNumber {

    fun missingNumber(nums: IntArray): Int {
        val boolNums = BooleanArray(nums.size + 1)

        for (num in nums) {
            boolNums[num] = true // boolNums[2] = false
        }

        return boolNums.indexOfLast { !it }
    }
}
