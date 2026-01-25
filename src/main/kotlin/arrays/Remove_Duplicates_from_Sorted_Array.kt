package arrays

class Remove_Duplicates_from_Sorted_Array {
    fun removeDuplicates(nums: IntArray): Int {
        var result = 1

        for (i in 1..nums.size - 1) {
            if (nums[i] != nums[i - 1]) {
                nums[result] = nums[i]
                result ++
            }
        }

        return result
    }
}
