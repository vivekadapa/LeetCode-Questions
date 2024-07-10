

class Solution {
    public int orangesRotting(int[][] grid) {
        int vis[][] = new int[grid.length][grid[0].length];
        Queue<Pair> queue = new LinkedList<>();
        int totalOranges = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 2){
                    Pair pair = new Pair(i,j,0);
                    queue.add(pair);
                    vis[i][j] = 2;
                }
                else{
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 2 || grid[i][j] == 1){
                    totalOranges++;
                }
            }
        }
        int rows[] = {-1,0,1,0};
        int cols[] = {0,1,0,-1};
        int time = 0;
        while(!queue.isEmpty()){
            Pair poppedPair = queue.poll();
            for(int i=0;i<4;i++){
                int newRow = poppedPair.row + rows[i];
                int newCol = poppedPair.col + cols[i];
                if(newRow >=0 && newCol >= 0 && newRow < grid.length && newCol < grid[newRow].length && vis[newRow][newCol] == 0 && grid[newRow][newCol] == 1){
                    Pair newpair = new Pair(newRow,newCol,poppedPair.time+1);
                    vis[newRow][newCol] = 2;
                    queue.add(newpair);
                    time = newpair.time;
                }
            }
        }
        
        int rotten = 0;
        for(int i=0;i<vis.length;i++){
            for(int j=0;j<vis[i].length;j++){
                if(vis[i][j] == 2){
                    rotten++;
                }
            }
        }
        System.out.println("rotten "  + rotten);
        System.out.println("total Oranges"  + totalOranges);        
        return rotten == totalOranges ? time  : -1;
    }
}


class Pair{
    int row;
    int col;
    int time;
    
    Pair(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}