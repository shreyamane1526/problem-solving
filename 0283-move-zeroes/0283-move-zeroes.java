class Solution {
    public void moveZeroes(int[] arr) {
        int i=-1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                i++;
                arr[i]=arr[j];
            }
        }
        for(int j=i+1;j<arr.length;j++){
            arr[j]=0;
        }
    }
}