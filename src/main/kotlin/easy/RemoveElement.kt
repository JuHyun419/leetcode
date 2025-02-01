package easy

/**
 * https://leetcode.com/problems/remove-element/description/
 */
class RemoveElement {

    fun removeElement(nums: IntArray, value: Int): Int {
        var counter = 0
        nums.forEach { if (it != value) nums[counter++] = it }

        return counter
    }
}

fun main() {
    val s = RemoveElement()
    println(s.removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2))
}

