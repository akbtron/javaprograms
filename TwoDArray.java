public class TwoDArray {
    public static void main(String[] args) {
        int result[][] = new int[4][];

        for (int i = 0; i < 4; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                result[i][j] = j + 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result[i][j] + " ,");
            }
            System.out.println();
        }
    }
}
