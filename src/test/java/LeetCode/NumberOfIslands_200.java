package LeetCode;

public class NumberOfIslands_200 {

    public int numIslands(char[][] grid){

        int counter=0;

        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[i].length ; j++) {

                if (grid[i][j] == '1') {
                    counter++;
                    callBSF(grid, i, j);
                }
            }
        }
        return counter;
    }

    public void callBSF(char[][] grid, int i, int j){

        if (i<0 || i>= grid.length || j<0 || j>= grid[i].length|| grid[i][j]=='0')
            return;

        grid[i][j]='0';
        callBSF(grid,i+1,j);
        callBSF(grid,i,j+1);
        callBSF(grid,i,j-1);
        callBSF(grid,i-1,j);


    }
}
