import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Use a PriorityQueue to store characters, ordered by frequency (descending)
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> charCount.get(b) - charCount.get(a));
        pq.addAll(charCount.keySet());

        StringBuilder ans = new StringBuilder();
        while (!pq.isEmpty()) {
            char c = pq.poll();
            int count = charCount.get(c);
            for (int i = 0; i < count; i++) {
                ans.append(c); // Efficiently append to the end
            }
        }

        return ans.toString();
    }
}