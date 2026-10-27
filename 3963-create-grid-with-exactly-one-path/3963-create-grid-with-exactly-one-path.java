class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
        for(int i=0;i<m;i++){
            String temp=new String();
            for(int j=0;j<n;j++){
                if(j==0 || i==m-1){ 
                temp+='.';
                }
                else{
                    temp+='#';
                }
            }
            ans[i]=temp;
        }
        return ans;
    }
}