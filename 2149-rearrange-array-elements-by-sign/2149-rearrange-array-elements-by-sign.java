class Solution {
    public int[] rearrangeArray(int[] nums) {
       int arr1[]=new int[nums.length/2];int idx1=0,idx2=0;
       int arr2[]=new int[nums.length/2];
       for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            arr2[idx2++]=nums[i];
        }
        else{
            arr1[idx1++]=nums[i];
        }
       }
       idx1=0;idx2=0;
       boolean pos=true;
       for(int i=0;i<nums.length;i++){
        if(pos){ 
        nums[i]=arr1[idx1++];pos=false;
        }
        else{
            nums[i]=arr2[idx2++];pos=true;
        }
       }
       return nums;
    }
}
