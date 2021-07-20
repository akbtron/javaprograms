public class CountSetOfBits {
    public static void main(String[] args) {
        System.out.println(solve(20));
    }
        public static int solve(int A) {
            int count = 0;
            for(int i=0;i<=A;i++){
                String binary = decimalToBinary(i);
                for(int j =0;j < binary.length();j++ ){
                    if(binary.charAt(j) == '1'){
                        count++;
                    }
                }
            }
            return count;
        }
        private static String decimalToBinary(int i) {
            String result = "";
            while(i>0){
                result = result + String.valueOf(i % 2);
                i = i/2;
            }
            return result;
        }
}
