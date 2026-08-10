class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,count1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
             count++;
            }
             else{
             count1=max(count1,count);
             count=0;
        }
        }
        return max(count1,count);
    }
    public int max(int a,int b){
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        return a;
    }
}