class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> li=new ArrayList<>();
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){continue;}
            int j=i+1,k=arr.length-1;
            
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum==0){
                    li.add(Arrays.asList(arr[i],arr[j],arr[k]));j++;k--;while(j<k && arr[j]==arr[j-1]){
                        j++;
                    }
                    while(k>j && arr[k]==arr[k+1]){
                        k--;
                    }
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return li;
    }
}