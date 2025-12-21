class Solution {
     public static void dfs(char[][] edges,int[][] vis,int x,int y){
       vis[x][y]=1;
        if(x+1<edges.length ){
            if(vis[x+1][y]==0 && edges[x+1][y]=='1'){ 
             dfs(edges,vis,x+1,y);
            }
        }
        if(y+1<edges[x].length){
            if(vis[x][y+1]==0 && edges[x][y+1]=='1'){
             dfs(edges,vis,x,y+1);
            }
        }
        if(x-1>=0){
            if(vis[x-1][y]==0 && edges[x-1][y]=='1'){
             dfs(edges,vis,x-1,y);
            }
            
        }
        if(y-1>=0 ){
            if(vis[x][y-1]==0 && edges[x][y-1]=='1'){
             dfs(edges,vis,x,y-1);
            }
        }
    }
    public int numIslands(char[][] grid) {
       int vis[][]=new int[grid.length][grid[0].length];
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            vis[i][j]=0;
        }
       }
       int c=0;
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){ 
          if(grid[i][j]=='1'&& vis[i][j]==0 ){ 
            c++;
            dfs(grid,vis,i,j);
          }
        }
       }
       return c;
    }
}