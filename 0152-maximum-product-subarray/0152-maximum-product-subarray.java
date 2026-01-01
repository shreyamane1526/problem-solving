class Solution {
    public int maxProduct(int[] nums) {
       int max=Integer.MIN_VALUE;
       int pre=1,suf=1;
       int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(suf==0 ){suf=1;}
            if(pre==0){pre=1;}
            suf*=nums[n-i-1];
            pre*=nums[i];
            max=Math.max(max,Math.max(suf,pre));
        }
        return max;
    }
}