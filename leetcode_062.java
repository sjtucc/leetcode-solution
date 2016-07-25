package cn.cc.org;

/*
 * 　1、当x=0或者y=0时有A[x][y] = 1； 
　　2、当x>=1并且y>=1时有A[\x][\y] = A[x-1][y]+A[\x][y-1]。 
　　3、所求的结点就是A[m-1][n-1]。
 */
public class leetcode_062 {
	public int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];

        // 第一列的解
        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }

        // 第一行的解    
        for (int i = 1; i < n; i++) {
            result[0][i] = 1;
        }

        // 其它位置的解
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        // 所求的解
        return result[m - 1][n - 1];
    }
}
