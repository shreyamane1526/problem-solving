class Solution {
    public int missingNumber(int[] nums) {
        //brute nlogn
        // Arrays.sort(nums);
        // int c=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==c){
        //         c++;
        //     }
        // }
        // return c;

        //optimal O(n)
        int s=-1,idx=-1;
        for(int i=0;i<nums.length;i++){
            int x=Math.abs( nums[i]);
            if(x==nums.length){s=nums.length;}
           else if(nums[x]==0){idx=-1;}
            else{nums[x]=-nums[x];}
        }
        if(s==-1){return nums.length;}
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                return i;
            }
            if(nums[i]==0){
                z=i;
            }
        }
        return z;
    }
}