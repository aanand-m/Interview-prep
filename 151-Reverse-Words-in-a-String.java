class Solution {
    public String reverseWords(String s) {
        StringBuilder stack = new StringBuilder();
        String[] words = s.split(\ +\);

        for (String word : words) {
            if (stack.length() > 0) stack.insert(0, \ \);
            stack.insert(0, word);
        }
        return stack.toString();
    }
}