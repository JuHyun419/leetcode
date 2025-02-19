package easy

/**
 * https://leetcode.com/problems/single-number/description/
 */
class SingleNumber {

    fun singleNumber(nums: IntArray): Int {
        val countMap = mutableMapOf<Int, Int>()

        for (num in nums) {
            countMap[num] = countMap.getOrDefault(num, 0) + 1
        }

        return countMap.entries.first { it.value == 1 }.key
    }

}
