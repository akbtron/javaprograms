public class RowCount {
    public static void main(String[] args) {
        int array[][] = new int[][]{{0,0,1,1},{0,0,1,1},{0,0,1,1},{1,1,1,1}};
        System.out.println(solve(array));
    }
    public static int solve(int[][] A)
    {
        int R = A.length;
        int C = A.length;
        int j,max_row_index = 0;
        j = C - 1;

        for (int i = 0; i < R; i++) {
            // Move left until a 0 is found
            while (j >= 0 && A[i][j] == 1) {
                j = j - 1; // Update the index of leftmost 1
                // seen so far
                max_row_index = i; // Update max_row_index
            }
        }
        if(max_row_index==0&&A[0][C-1]==0)
            return -1;
        return max_row_index;
    }
}