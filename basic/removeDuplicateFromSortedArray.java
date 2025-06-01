class Solution {
    public int removeDuplicates(int[] nums) {
        int currIndex= 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[currIndex] && currIndex!=i){
                nums[currIndex] = nums[i];
                currIndex++;  
            }
        }
        return currIndex;
    }
}