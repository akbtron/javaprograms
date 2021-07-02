public class BinaryToDecimal {
    public static int convertBinaryToDecimal(String binary) {
        int conversion = 1;
        int result = 0;

        for(int i=1;i<binary.length();i++){
            if(binary.charAt(binary.length() - i) == '1'){
                result = result + conversion;
            }
            conversion = conversion * 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Result is  :"+convertBinaryToDecimal("110011"));
    }
}
