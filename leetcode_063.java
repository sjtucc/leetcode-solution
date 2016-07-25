package cn.cc.org;
/*
 * 1����x=0����y=0ʱ������(x, y)λ�����ϰ�����A[x][y] = 1�� ���ϰ�����0 
����2����x>=1����y>=1ʱ������(x, y)λ�����ϰ�����A[x][y] = A[x-1][y]+A[x][y-1]�� ���ϰ�����0 
����3������Ľ�����A[m-1][n-1]�� 
 */
public class leetcode_063 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // ����У��
        if (obstacleGrid == null || obstacleGrid.length < 1 || obstacleGrid[0].length < 1
                || obstacleGrid[0][0] == 1
                || obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1) {
            return 0;
        }

        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] result = new int[rows][cols];

        // ��һ��λ���ж����ַ��������ϰ�����1�֣����ϰ�����0��
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
