class Solution {
    public String frequencySort(String s) {
        int[] freq = new int [256];
        int n = s.length();
        char[] charArr = new char[n];
        for (char c : s.toCharArray()){
            freq[c]++;
        }
        for (int i = 0; i<n;) {
            int max = 0;
            int index = 0;

            for (int j = 0; j<256; j++) {
                if (freq[j] > max) {
                    max = freq[j];
                    index = j;
                }
            }

            while (freq[index] > 0) {
                charArr[i++] = (char) index;
                freq[index]--;
            }

        }
        return new String(charArr);
    }
}