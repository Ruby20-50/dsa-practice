import java.util.*;
public class Solution {
  /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
  
       long total = 0;
    long min = Long.MAX_VALUE;
    long max = -1;

    for (int num : arr) {
        total += num;
        min = Math.min(min, num);
        max = Math.max(max, num);
    }

    // excluding the max element gives the minimum possible sum of four
    // excluding the min element gives the maximum possible sum of four
    System.out.println((total - max) + " " + (total - min));
    }

}
