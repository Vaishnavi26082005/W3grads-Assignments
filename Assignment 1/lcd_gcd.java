import java.util.*;
public class lcm_gcd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Long A= sc.nextLong();
        Long B=sc.nextLong();
        System.out.println(Arrays.toString(lcmAndGcd(A,B)));

    }
    public static  Long[] lcmAndGcd(Long A, Long B) {
        Long[] arr = new Long[2];
        Long d = A;
        Long di = B;
        Long gcd = 0L;
        Long rem = 0L;

        while (d%di != 0) {
            rem = d % di;
            d = di;
            di = rem;
        }
        gcd = di;
        Long lcm = (A * B) / gcd;
        arr[0] = lcm;
        arr[1] = gcd;
        return arr;
    }

}

