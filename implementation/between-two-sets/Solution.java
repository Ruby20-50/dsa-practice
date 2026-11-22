import java.util.List;

public class Solution {
     /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    
        int l = 1;
        for (int x : a) {
            l = lcm(l, x);
        }

        int g = 0;
        for (int x : b) {
            g = gcd(g, x);
        }
    
        int count = 0;
        for (int x = l; x <= g; x += l) {
            if (g % x == 0) {
            count++;
            }
        }
        return count;
    }
    
    private static int gcd(int p, int q) {
    return q == 0 ? p : gcd(q, p % q);
    }

    private static int lcm(int p, int q) {
    return p / gcd(p, q) * q;
    }
  
}