class Solution {
    public static boolean dfs(int[][] edges,int[] vis,int start,int col){
       vis[start]=col;
        for(int x:edges[start]){
            if(vis[x]==0){
                int p=col;
                if(col==1){p=2;}
                else{p=1;}
                if(dfs(edges,vis,x,p)==false){
                    return false;
                }          
            }
            else{
                if(vis[start]==vis[x]){return false;}
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
       int vis[]=new int[graph.length];
       Arrays.fill(vis,0);
       int j=0;
       int col=1;
       for(int i=0;i<graph.length;i++){
        if(vis[i]==0){ 
          if(!dfs(graph,vis,i,col)){return false; } 
        }
       }
       return true;
    }
}