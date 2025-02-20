class Solution {
    StringBuilder ans = new StringBuilder();
    public String frequencySort(String s) {
        NavigableMap<Integer, List <Character>> freq = new TreeMap<>();
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c,0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            char letter = entry.getKey();
            int count = entry.getValue();

            if (!freq.containsKey(count)) {
                freq.put(count, new ArrayList<>());
            }
            freq.get(count).add(letter);
        }

        for(Map.Entry<Integer,List<Character>> entry : freq.descendingMap().entrySet()) {
            int count = entry.getKey();
            List <Character> charList = entry.getValue();
            for ( char c : charList) {
                build(count, c);
            }
        }

        return ans.toString();

    }

    public void build (int count , char letter) {
        for (int i =0 ; i<count; i++) {
            ans.append(letter);
        }
    }
}