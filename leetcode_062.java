package cn.cc.org;

/*
 * ��1����x=0����y=0ʱ��A[x][y] = 1�� 
����2����x>=1����y>=1ʱ��A[\x][\y] = A[x-1][y]+A[\x][y-1]�� 
����3������Ľ�����A[m-1][n-1]��
 */
public class leetcode_062 {
	public int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];

        // ��һ�еĽ�
        for (int i = 0; i < m; i++) {
            result[i][0] = 1;
        }

        // ��һ�еĽ�    
        for (int i = 1; i < n; i++) {
            result[0][i] = 1;
        }

        // ����λ�õĽ�
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }

        // ����Ľ�
        return result[m - 1][n - 1];
    }
}
