class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>> li,int[] vis,int source,int d){
        if(source==d){return true;}
        vis[source]=1;
        for(int x:li.get(source)){
            if(vis[x]==0){
                if(dfs(li,vis,x,d)){return true;}
            }
        }
        return false;

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int visited[]=new int[n];
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            li.get(edges[i][0]).add(edges[i][1]);
            li.get(edges[i][1]).add(edges[i][0]);
        }
        return dfs(li,visited,source,destination);
    }
}