import java.util.*;

public class Solution {
     /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int aCount = 0;
        int oCount = 0;
        for(int m : apples){
            m += a;
            if(m >=s && m <= t)
                aCount++;
        }
        for(int n : oranges){
            n += b;
            if(n >=s && n <= t)
                oCount++;
        }
            System.out.println(aCount + "\n"+ oCount);
    }

}