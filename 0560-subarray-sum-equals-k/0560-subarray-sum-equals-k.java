class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int ans=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum-k;
            // if(rem==0){
            //     ans++;
            // }
           if(hm.containsKey(rem)){
                ans+=hm.get(rem);
            }
            if(hm.containsKey(sum)){
                int x=hm.get(sum);
                hm.put(sum,x+1);
            }
            else{ 
            hm.put(sum,1);
            }
        }
        return ans;
    }
}