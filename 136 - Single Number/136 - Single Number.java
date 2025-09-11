class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        int minFreq=Collections.min(freq.values());
        List<Integer> least=new  ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == minFreq){
                return entry.getKey();
            }
        }
        return -1;
    }
}
