class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=Math.abs(nums[i]);
        }
        Arrays.sort(temp);
        int odd=n/2;
        long ans=0;
        for(int i=0;i<odd;i++){
            ans-=(long)temp[i]*temp[i];
        }
        for(int i=odd;i<n;i++){
            ans+=(long)temp[i]*temp[i];
        }
        return ans;
    }
}