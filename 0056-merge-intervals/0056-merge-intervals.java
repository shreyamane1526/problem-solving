class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> li=new ArrayList<>();
        int s=intervals[0][0],e=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(e>=start){
                if(end>e){
                    e=end;
                }
            }
            else{
                li.add(new int[]{s,e});
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }
        li.add(new int[] {s,e});
        int arr[][]=new int[li.size()][2];
        int idx=0;
        for(int[] x:li){
            int a=x[0],b=x[1];
            arr[idx][0]=a;arr[idx++][1]=b;
        }
        return arr;
    }
}