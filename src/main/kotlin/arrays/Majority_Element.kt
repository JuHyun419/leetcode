package arrays

/**
 * https://leetcode.com/problems/majority-element/description/
 */
class Majority_Element {
    fun majorityElement(nums: IntArray): Int {
        nums.sort()
        return nums[nums.size / 2]
    }

    fun majorityElement2(nums: IntArray): Int {
        var candidate = 0
        var count = 0

        for (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }

        return candidate
    }
}
