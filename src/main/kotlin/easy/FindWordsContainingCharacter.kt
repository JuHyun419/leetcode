package easy

/**
 * https://leetcode.com/problems/find-words-containing-character/
 */
class FindWordsContainingCharacter {

    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        var result = mutableListOf<Int>()

        for (i in words.indices) {
            val word = words[i]
            if (word.contains(x)) {
                result.add(i)
            }
        }

        return result
    }

    fun findWordsContainingFunctional(words: Array<String>, x: Char): List<Int> =
        words.mapIndexedNotNull { index, word -> index.takeIf { x in word } }

}
