class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>> li,int start,int arr[],int vis[]){
        vis[start]=1;
        int x=start+arr[start];
        if(x>=0 && x<arr.length && vis[x]==0){
            li.get(start).add(x);
            if(arr[x]==0){
                return true;
            }
            if(dfs(li,x,arr,vis)){return true;}
        }
        int y=start-arr[start];
         if(y>=0 && y<arr.length && vis[y]==0){
            li.get(start).add(y);
            if(arr[y]==0){
                return true;
            }
            if(dfs(li,y,arr,vis)){return true;}
        }
        return false;
    }
    public boolean canReach(int[] arr, int start) {
        if(arr[start]==0){
            return true;
        }
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        int vis[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            li.add(new ArrayList<>());
        }

        return dfs(li,start,arr,vis);
    }
}