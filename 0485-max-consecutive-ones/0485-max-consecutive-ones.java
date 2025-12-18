class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int cursum=0;
            while(i<nums.length && nums[i]!=0){
                cursum++;
                i++;
            }
            max=Math.max(cursum,max);
            
        }
        return max;
    }
}