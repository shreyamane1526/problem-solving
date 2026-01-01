class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li=new ArrayList<>();
       
        int ct1=0,ct2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(ct1==0 && nums[i]!=ele2){
                ele1=nums[i];
                ct1++;
            }
            else if(ct2==0 && nums[i]!=ele1){
                ct2++;
                ele2=nums[i];
            }
            else if(ele1==nums[i]){
                ct1++;
            }
            else if(ele2==nums[i]){
                ct2++;
            }
            else{
                ct1--;
                ct2--;
            }
        }
        ct1=0;ct2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele1){
                ct1++;
            }
            else if(nums[i]==ele2){
                ct2++;
            }
        }
        int mini=nums.length/3+1;
        if(ct1>=mini){
            li.add(ele1);
        }
        if(ct2>=mini){
            li.add(ele2);
        }
        return li;
    }
}