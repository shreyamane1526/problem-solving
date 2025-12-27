class Solution {
    public static int  bfs(int[][] grid){
       int days=0;
       ArrayDeque<int[]> q=new ArrayDeque<>();
       int n=grid.length,m=grid[0].length;
       int tot=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                tot++;
            }
            else if(grid[i][j]==2){
                q.add(new int[]{i,j});
            }
        }}
        int ct=0;
        while(!q.isEmpty()){
            int k=q.size();
            for(int i=0;i<k;i++){
                int[] r=q.poll();
                int[] dx={0,1,-1,0};
                int[] dy={1,0,0,-1};     
                for(int j=0;j<4;j++){
                    int a=r[0]+dx[j],b=r[1]+dy[j];
                    if(a<n && a>=0 && b>=0 && b<m && grid[a][b]==1){
                        grid[a][b]=2;
                        q.add(new int[]{a,b});
                        ct++;
                    }
                }
            }
            if(!q.isEmpty()){days++;}
        }
       
       if(ct<tot){return -1;}
       return days;
    }
    public int orangesRotting(int[][] grid) {
        return bfs(grid);
    }
}