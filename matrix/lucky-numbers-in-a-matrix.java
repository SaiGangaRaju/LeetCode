class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        ArrayList<Integer> ls = new ArrayList<>();

        int m = mat.length;
        int n = mat[0].length;

        int[] row = new int[m];  
        int[] col = new int[n];  
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, mat[i][j]);
            }
            row[i] = min;
        }
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, mat[i][j]);
            }
            col[j] = max;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == row[i] && mat[i][j] == col[j]) {
                    ls.add(mat[i][j]);
                }
            }
        }

        return ls;
    }
}