package org.example;

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        //base case
        int max = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == '1') {
                dp[0][j] = 1;
                max = 1;
            } else dp[0][j] = 0;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == '1' && j != 0){
                    dp[i][j] = min(dp[i -1][j - 1], dp[i][j - 1], dp[i -1][j]) + 1;
                    max = Math.max(max, dp[i][j]);
                } else if (j == 0 && matrix[i][j] == '1') {
                    dp[i][j] = 1;
                    max = Math.max(max, dp[i][j]);
                }
            }
    }
        return max * max;
    }

    private int min(int a, int b, int c) {
        int minValue = a;

        if (b < minValue) {
            minValue = b;
        }

        if (c < minValue) {
            minValue = c;
        }

        return minValue;
    }
}