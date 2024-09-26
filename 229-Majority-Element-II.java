class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majority  = new ArrayList <> ();
        Map <Integer, Integer> ele = new HashMap<>();
        for (int num: nums) {
            int value = ele.getOrDefault(num, 0);
            ele.put(num, value + 1);
        }

        for (int key: ele.keySet()) {
            if (ele.get(key) > nums.length / 3) majority.add(key);
        }

        return majority;
    }
}