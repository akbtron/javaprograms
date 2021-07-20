public class BitsCount {
    public static int solve(int A) {
        if(A == 0){
            return 0;
        }
        int count = 0;
        int x = largestPowerOf2inRangeA(A);
        int bitsTill2RaiseX = x * (1 << (x-1));
        int msb2RaiseXtoN = A - (1 << x) + 1;
        int rest = A - (1 << x);
        int answer = bitsTill2RaiseX + msb2RaiseXtoN + solve(rest);
        return answer;
    }
    private static int largestPowerOf2inRangeA(int A) {
        int x = 0;
        while((1 << x) <= A) {
            x++;
        }
        return x-1;
    }
}