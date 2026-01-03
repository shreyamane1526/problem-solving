class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        long sum=0,sqSum=0;
        long n=grid.length;
        n*=n;
        long sumn=n*(n+1)/2;
        long sqSumn=n*(n+1)*(2*n+1)/6;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                sum+=grid[i][j];
                sqSum+=(long)grid[i][j]*grid[i][j];
            }
        }
        long xplusy=-sumn+sum;
        long xminy=(-sqSumn+sqSum)/xplusy;
        long x=(xplusy+xminy)/2;
        long y=-xplusy+x;
        ans[0]=(int)x;
        ans[1]=(int)y;
        return ans;
    }
}