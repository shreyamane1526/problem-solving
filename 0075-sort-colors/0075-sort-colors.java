class Solution {
    public void sortColors(int[] arr) {
        int i=0,j=0,m=0;;
        for(int k=0;k<arr.length;k++){
            if(arr[k]==2){
                j++;
            }
            else if(arr[k]==0){
                i++;
            }
            else{
                m++;
            }
        }
        int idx=0;
        while(i-->0){
            arr[idx++]=0;
        }
        while(m-->0){
            arr[idx++]=1;
        }
        while(j-->0){
            arr[idx++]=2;
        }
    }
}