class Solution {
    public static void bfs(int start,int isConnected[][],int[] vis){
        vis[start]=1;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(start);
        while(!q.isEmpty()){
            start=q.poll();
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==0 && isConnected[start][i]==1){
                vis[i]=1;
                q.add(i);
            }
        }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int c=0;
        int[] vis=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==0){
                bfs(i,isConnected,vis);
                c++;
            }
        }
        return c;
    }
}