import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5,6,7,8,9};
        int target = 10;
        int result[] = twoSum(a,target);
        System.out.println(result[0] +"   "+result[1]);
    }

    private static int[] twoSum(int[] a, int target) {
        Map<Integer,Integer> hash = new HashMap<>();
        int result[] = new int[2];
        for(int i=0;i<a.length;i++) {
            if(hash.containsKey(target - a[i])){
                result[0] = i;
                result[1] = hash.get(target - a[i]);
                return result;
            }
            hash.put(a[i],i);
        }
        return result;
    }
}
