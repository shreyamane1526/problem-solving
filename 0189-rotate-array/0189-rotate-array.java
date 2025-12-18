class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        
        int store[]=new int[k];
        int j=nums.length-k;
        for(int i=0;i<k;i++){
            store[i]=nums[j++];
        }
        for(int i=nums.length-1;i>=k;i--){
            nums[i]=nums[i-k];
        }
        for(int i=0;i<k;i++){
            nums[i]=store[i];
        }
        
        
      
    }
}