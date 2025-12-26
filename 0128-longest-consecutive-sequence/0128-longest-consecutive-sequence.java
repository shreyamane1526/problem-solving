class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        Set<Integer> li=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            li.add(nums[i]);
        }
        int longest=1;
        for(int x:li){
            if(!li.contains(x-1)){
                int c=1;
                int it=x;
                while(li.contains(x+1)){
                    c++;
                    x++;
                }
                longest=Math.max(longest,c);
            }
        }
        return longest;
    }
}