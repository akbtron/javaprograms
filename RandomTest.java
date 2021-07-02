import java.math.BigInteger;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BigInteger bigInteger = new BigInteger(50000,new Random());
        System.out.println(bigInteger.nextProbablePrime());
        long end = System.currentTimeMillis();
        System.out.println("Time took is :"+(end-start));
    }
}
