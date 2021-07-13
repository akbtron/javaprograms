public class AtleastTwoGreaterElements {
    public static void main(String[] args) {
        int array[] = new int[]{10, 40, 1, 45, 20, 21, 2, 80, 78, 90, 100, 5, 55};

        int result[] = new int[array.length - 2];

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstMax) {
                secondMax = firstMax;
                firstMax = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < secondMax) {
                result[k++] = array[i];
            }
        }

        System.out.print("Elements which are having atleast two greater elements are :");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ,");
        }
    }
}
