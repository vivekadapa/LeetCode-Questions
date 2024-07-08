class Solution {
    
    public static void dfs(int node,int[][] adj,int[] vis){
        vis[node] = 1;
        for(int i=0;i<adj[0].length;i++){
            if(adj[node-1][i] == 1 && vis[i + 1] != 1){
                vis[i + 1] = 1;
                dfs(i+1,adj,vis);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int vert = isConnected[0].length;
        int vis[] = new int[vert+1];
        int count = 0;
        for(int i=1;i<vis.length;i++){
            if(vis[i] != 1){
                dfs(i,isConnected,vis);
                count++;
            }
        }
        
        return count;
        
    }
}