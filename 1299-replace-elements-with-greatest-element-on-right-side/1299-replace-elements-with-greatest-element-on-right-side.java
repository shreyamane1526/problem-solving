class Solution {
    public int[] replaceElements(int[] arr) {
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){arr[arr.length-1]=-1;break;}
            int max=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[j]){max=arr[j];}
            }
            arr[i]=max;
        }
        return arr;
    }
}