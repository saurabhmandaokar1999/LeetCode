class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Integer, Long> freq = magazine.chars()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return ransomNote.chars().allMatch(ch -> {
            long count = freq.getOrDefault(ch, 0L);
            if (count == 0) return false;
            freq.put(ch, count - 1);
            return true;
        });
    }
}
