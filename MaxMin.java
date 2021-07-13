public class MaxMin {
    public static void main(String[] args) {
        int a[] = new int[]{5, 9, 3, 6, 1, 8};

        int maxElement = findMax(a);
        int minElement = findMin(a);

        int numberOfElementsBetweenMaxAndMin = findNumberOfElementsBetweenMaxAndMin(maxElement, minElement, a);

        System.out.println("The Max Element is :" + maxElement);
        System.out.println("The Min Element is :" + minElement);
        System.out.println("Number of Elements between Max and Min are :" + numberOfElementsBetweenMaxAndMin);

    }

    private static int findNumberOfElementsBetweenMaxAndMin(int max, int min, int[] a) {

        int numberOfElementsBetweenMaxAndMin = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > min && a[i] < max) {
                numberOfElementsBetweenMaxAndMin++;
            }
        }

        return numberOfElementsBetweenMaxAndMin;

    }

    private static int findMin(int[] a) {
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < minElement) {
                minElement = a[i];
            }
        }
        return minElement;
    }

    private static int findMax(int[] a) {
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxElement) {
                maxElement = a[i];
            }
        }

        return maxElement;

    }
}
