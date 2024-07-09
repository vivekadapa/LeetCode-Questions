class Solution {
    
    public static void dfs(int[][] ans,int[][] image,int i,int j,int color,int initColor,int[] rows,int[] cols){
        ans[i][j] = color;
        for(int k=0;k<4;k++){
            int currRow = i + rows[k];
            int currCol = j + cols[k];
            if(currRow >= 0 && currCol >=0 && currRow < image.length && currCol < image[i].length && image[currRow][currCol] == initColor && image[currRow][currCol] != color){
                 dfs(ans,image,currRow,currCol,color,initColor,rows,cols);
            }
        }
    }
    
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int rows[] = {-1,0,1,0};
        int cols[] = {0,1,0,-1};
        int initColor = image[sr][sc];
        ans[sr][sc] = color;
        dfs(ans,image,sr,sc,color,initColor,rows,cols);
        return ans;        
    }
}