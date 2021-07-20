public class BinaryTest {
    public static void main(String[] args) {
        String str1 = "110";
        int sum = 0;
        System.out.println((str1.charAt(0) - '0'));
        System.out.println(str1.charAt(1) + '0');
        System.out.println(str1.charAt(2) + '0');
        //sum += str1.charAt(0) - '0';
        sum += str1.charAt(1);
        System.out.println(sum);
    }
}
