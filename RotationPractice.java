import java.util.Scanner;

public class RotationPractice {
    public static void main(String[] args) {
        System.out.println("Enter Size of Array");
        Scanner scanner = new Scanner(System.in);
        var sizeOfArray = scanner.nextInt();
        int array[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of rotation :");
        var rotateBy = scanner.nextInt();
        rotateBy%=sizeOfArray;
        reverse(array,0,sizeOfArray-1);
        reverse(array,0,rotateBy-1);
        reverse(array,rotateBy,sizeOfArray-1);
        for(int i:array){
            System.out.print(i+ " ");
        }
    }

    private static void reverse(int[] array, int start, int end) {
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
