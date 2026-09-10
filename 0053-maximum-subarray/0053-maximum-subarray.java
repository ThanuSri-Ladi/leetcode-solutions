class Solution {
    public int maxSubArray(int[] nums) {
        int currentE=nums[0];
        int maxE=nums[0];
        for(int i=1;i<nums.length;i++){
            currentE=Math.max(nums[i],currentE+nums[i]);
            maxE=Math.max(maxE,currentE);
        }
        return maxE;
    }
}