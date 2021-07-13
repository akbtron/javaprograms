public class SecondMax {
    public static void main(String[] args) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int a[] = new int[]{10, 45, 5, 2, 30, 80, 1, 55, 7};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > firstMax) {
                secondMax = firstMax;
                firstMax = a[i];
            } else if (a[i] > secondMax) {
                secondMax = a[i];
            }
        }

        System.out.println("First max and second max numbers are :" + firstMax + "   , " + secondMax);
    }
}
