class Solution:
    def groupAnagrams(self, strings: List[str]) -> List[List[str]]:
        anagrams = dict()
        anagramGroups = []
        for string in strings:
            sortedString = "".join(sorted(string))
            stringList = anagrams.get(sortedString)
            if stringList is None:
                anagrams[sortedString] = []
            anagrams[sortedString].append(string)
        for sortedString in anagrams:
            anagramGroups.append(anagrams[sortedString])
        return anagramGroups
