import java.util.Scanner;

public class RotationArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value of T :");
        int T = scanner.nextInt();
        for(int j=0;j<T;j++){
            System.out.println("Enter the size of Array :");
            int sizeOfArray = scanner.nextInt();
            int A[] = new int[sizeOfArray];
            System.out.println("Enter Elements of Array :");
            for(int i=0;i<sizeOfArray;i++){
                A[i] = scanner.nextInt();
            }
            System.out.println("Enter the value of B :");
            int B = scanner.nextInt();
            B = B%sizeOfArray;
            reverse(A,0,sizeOfArray - 1);
            reverse(A,0,B - 1);
            reverse(A,B,sizeOfArray - 1);

            for(int i=0;i<sizeOfArray;i++){
                System.out.println(A[i]);
            }
        }
    }

    private static void reverse(int[] a, int i, int i1) {
        while(i < i1){
            int temp = a[i];
            a[i] = a[i1];
            a[i1] = temp;
            i++;
            i1--;
        }
    }
}
