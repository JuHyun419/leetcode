package easy

import java.util.*

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        Arrays.sort(strs, Comparator.comparing { obj: String -> obj.length })

        val first = strs[0]
        val result = StringBuilder()

        for (i in first.indices) {
            for (j in 1..<strs.size) {
                if (first[i] != strs[j][i]) {
                    return result.toString()
                }
            }
            result.append(first[i])
        }

        return result.toString()
    }

    fun longestCommonPrefix2(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        val first = strs.minByOrNull { it.length } ?: ""
        for (i in first.indices) {
            if (strs.any { it[i] != first[i] }) {
                return first.substring(0, i)
            }
        }
        return first
    }

}
