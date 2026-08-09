import java.util.*;

public class Solution {
    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(1,2,3,4);
        System.out.println(birthdayCakeCandles(candles));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallestCndl = 0 ;
        int count = 0;
        for(int i = 0; i < candles.size(); i++){
            tallestCndl = Math.max(tallestCndl, candles.get(i));
            if(tallestCndl == candles.get(i))
            count ++;
            else if(tallestCndl < candles.get(i))
                count = 1; 
        }
        return count;
    }
}
