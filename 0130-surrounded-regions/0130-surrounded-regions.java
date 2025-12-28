class Solution { 
    public static void dfs(char[][] board,int i,int j,int m,int n){
        boolean flag=false;
        ArrayDeque<int[]> s=new ArrayDeque<>();
        s.push(new int[]{i,j});
        ArrayList<int[]> li=new ArrayList<>();
        int dx[]={0,0,1,-1};
        int[] dy={1,-1,0,0};
        while(!s.isEmpty()){
            int cell[]=s.pop();
            int a=cell[0];
            int b=cell[1];
            if(board[a][b]=='O'){ 
              board[a][b]='/';
            li.add(new int[]{a,b});
            if(a==0 || b==0  || a==m-1 || b==n-1){
                flag=true;
            }
            for(int k=0;k<4;k++){
                int x=a+dx[k],y=b+dy[k];
                if(x>=0 && y>=0 && x<m && y<n && board[x][y]=='O'){
                    s.push(new int[]{x,y});
                } 
            }
            }
        }
        if(!flag){
            for(int[] p:li){
                int a=p[0],b=p[1];
                board[a][b]='X';
            }
        }
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    dfs(board,i,j,m,n);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='/'){
                    board[i][j]='O';
                }
            }
        }
    }
}