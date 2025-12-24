class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int c=0;
        int istart=0,jstart=0,imax=m-1,jmax=n-1;
        int is=0,js=0,ie=m-1,je=n-1;
        while(true){
            int j=js;
          while(js<=je){
           li.add(matrix[is][js++]);c++;
          }if(c==m*n){return li;}
          js=j;is++;
          int i=is;
          while(is<=ie){
            li.add(matrix[is++][je]);c++;
          }if(c==m*n){return li;}
          is=i;je--;
          int j2=je;
          while(je>=js){
            li.add(matrix[ie][je--]);c++;
          }if(c==m*n){return li;}
          je=j2;ie--;
          int i2=ie;
          while(ie>=is){
            li.add(matrix[ie--][js]);c++;
          }if(c==m*n){return li;}
          ie=i2;js++;
          
        }
       // return li;
    }
}