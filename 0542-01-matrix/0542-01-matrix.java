class Solution {
    public static void bfs(int[][] mat,int[][] vis,int i,int j,int m,int n){
        /*dry run
        0,0,0-> vis[01-1,10-0]->0,1,1 ->vis[02-0,11-2]-->1,0,0->vis[20-0,]->

        */
        ArrayDeque<int[]> q=new ArrayDeque<>();
        q.add(new int[]{i,j,0});
        vis[i][j]=0;
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int x=cur[0];
            int y=cur[1];
            int d=cur[2];
            if(vis[x][y]<d){continue;}
            int dx[]={0,0,1,-1};
            int dy[]={1,-1,0,0};
            for(int k=0;k<4;k++){
                int a=x+dx[k],b=y+dy[k];
                if(a>=0 && b>=0 && a<m && b<n){
                 if(vis[a][b]==-1){ 
                    if(mat[a][b]==0){
                        q.add(new int[]{a,b,0});
                        vis[a][b]=0;
                    }
                    else{ 
                     q.add(new int[]{a,b,d+1});
                     vis[a][b]=d+1;
                    }
                 }
                 else{  
                    if(d+1<vis[a][b]){ 
                    vis[a][b]=d+1;
                    q.add(new int[]{a,b,d+1});
                    }
                 }
                }
            }
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int vis[][]=new int[m][n];
        for(int i=0;i<m;i++){Arrays.fill(vis[i],-1);}
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    bfs(mat,vis,i,j,m,n);
                    return vis;
                }
            }
        }
        return vis;
    }
}