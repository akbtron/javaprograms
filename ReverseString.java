import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        Scanner scanner = new Scanner(System.in);
        var input = scanner.next();
        var output = reverse(input);
        System.out.println("The Reverse of "+input+"  is "+output);
        /*for(char c:output){
            System.out.print(c);
        }*/
    }

    private static String reverse(String input) {
        char[] ch = input.toCharArray();
        int charLength = ch.length;
        int start = 0;
        int end = charLength - 1;
        while(start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }
}
