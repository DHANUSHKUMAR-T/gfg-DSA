class Solution {
    public int countIslands(char[][] grid) {
        // Code here
        int c=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]=='L') {
                    c++;
                dfs(grid,i,j);
                }
            }
        }
        return c;
    }
    public void dfs(char grid[][],int i,int j) {
        if(i>=grid.length ||i<0 ||j>=grid[0].length ||j<0 || grid[i][j]=='W')
        return;
        if(grid[i][j]=='L')
        grid[i][j]='W';
        
        dfs(grid,i+1,j); //South
        dfs(grid,i,j+1); //East
        dfs(grid,i-1,j); //North
        dfs(grid,i,j-1); //West
        dfs(grid,i+1,j-1); //SouthWest
        dfs(grid,i+1,j+1); //SouthEast
        dfs(grid,i-1,j+1); //NorthEast
        dfs(grid,i-1,j-1); //NorthWest
    }
}