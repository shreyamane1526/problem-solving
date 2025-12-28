class Solution {
    public static int dfs(int[][] grid,int p,int q,int m,int n){
        ArrayDeque<int[]> s=new ArrayDeque<>();
        s.push(new int[] {p,q});
        int c=0;
        boolean flag=false;  
        while(!s.isEmpty()){
            int[] node=s.pop();
            int a=node[0],b=node[1];
        if(grid[a][b]==1){ 
             grid[a][b]=2;
             c++;
            if(a==0 || b==0 || a==m-1 || b==n-1){
                flag=true;
            }
            int[] dx={0,0,1,-1};
            int[] dy={1,-1,0,0};
            for(int i=0;i<4;i++){
                int x=a+dx[i],y=b+dy[i];           
                if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1){  
                    s.push(new int[]{x,y});
                }
            }
       }
        }
        if(!flag){return c;}
        return 0;
    }
    public int numEnclaves(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    c+=dfs(grid,i,j,m,n);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        return c;
    }
}