package cn.cc.org;
/*
 * 1、当x=0或者y=0时，并且(x, y)位置无障碍。有A[x][y] = 1； 有障碍就是0 
　　2、当x>=1并且y>=1时，并且(x, y)位置无障碍。有A[x][y] = A[x-1][y]+A[x][y-1]。 有障碍就是0 
　　3、所求的结点就是A[m-1][n-1]。 
 */
public class leetcode_063 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // 输入校验
        if (obstacleGrid == null || obstacleGrid.length < 1 || obstacleGrid[0].length < 1
                || obstacleGrid[0][0] == 1
                || obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) {
            return 0;
        }

        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] result = new int[rows][cols];

        // 第一个位置有多少种方法，无障碍就是1种，有障碍就是0种
        result[0][0] = obstacleGrid[0][0] == 0 ? 1 : 0;

        for (int i = 1; i < cols; i++) {
            result[0][i] = obstacleGrid[0][i] == 0 ? result[0][i - 1] : 0;
        }

        for (int i = 1; i < rows; i++) {
            result[i][0] = obstacleGrid[i][0] == 0 ? result[i - 1][0] : 0;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                result[i][j] = obstacleGrid[i][j] == 0 ? result[i - 1][j] + result[i][j - 1] : 0;
            }
        }

        return result[rows - 1][cols - 1];
    }
}
