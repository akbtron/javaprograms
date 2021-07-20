 public class AddBinary {
    public static void main(String[] args) {
        String str1 = "101";
        String str2 = "110";
        int carry = 0;
        String result = "";
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        while(i >= 0 || j >= 0 || carry == 1){
            carry+= ((i >= 0) ? str1.charAt(i) - '0':0);
            carry+= ((j >= 0) ? str2.charAt(j) - '0':0);

            result = (char) (carry % 2 + '0') + result;

            carry /= 2;

            i--;
            j--;
        }
        System.out.println("The Sum is :"+result);

    }
}
