class Solution {
    public int searchInsert(int[] nums, int target) {
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                val=val+1;
                return i;
            }
            
        }
        for(int i=0;i<nums.length;i++){
           if(val==0 && nums[i]>target){
              return i;
           }
        }
        return nums.length;
    }
}
