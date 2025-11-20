import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String frequencySort(String s) {
        // Step 1: Count frequency of each character
        Map<Character, Long> freqMap = s.chars()
            .mapToObj(c -> (char)c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        // Step 2: Sort by frequency (descending)
        return freqMap.entrySet().stream()
            .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
            // Step 3: Repeat each character according to its frequency
            .map(e -> String.valueOf(e.getKey()).repeat(e.getValue().intValue()))
            .collect(Collectors.joining());
    }
}