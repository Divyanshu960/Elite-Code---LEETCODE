class Solution:
    def groupAnagrams(self, strings: List[str]) -> List[List[str]]:
        anagrams = dict()
        anagramGroups = []
        for i in strings:
            sortedString = "".join(sorted(i))
            stringList = anagrams.get(sortedString)
            if stringList is None:
                anagrams[sortedString] = []
            anagrams[sortedString].append(i)
        for sortedString in anagrams:
            anagramGroups.append(anagrams[sortedString])
        return anagramGroups
