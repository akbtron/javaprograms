public class AtleastTwoGreater {
    public static void main(String[] args) {
        int a[] = new int[]{1, 6, 9, 2, 3, 5, 10, 55, 23, 45, 60};

        int firstMax = findFirstMax(a);
        int secondMax = findSecondMax(firstMax, a);
        int result[] = new int[a.length];
        result = findArrayHavingAtleastTwoGreaterElements(firstMax, secondMax, a);

        System.out.println("The First Max Element is :" + firstMax);
        System.out.println("The Second Max Element is :" + secondMax);
        printArray(result);
    }

    private static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ,");
        }
    }

    private static int[] findArrayHavingAtleastTwoGreaterElements(int firstMax, int secondMax, int[] a) {
        int result[] = new int[a.length - 2];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < secondMax) {
                result[k++] = a[i];
            }
        }
        return result;
    }

    private static int findSecondMax(int firstMax, int[] a) {
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondMax && a[i] < firstMax) {
                secondMax = a[i];
            }
        }

        return secondMax;
    }

    private static int findFirstMax(int[] a) {
        int firstMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > firstMax) {
                firstMax = a[i];
            }
        }
        return firstMax;
    }
}
