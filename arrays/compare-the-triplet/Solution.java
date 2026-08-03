import java.util.*;
class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int bobScore = 0;
        int aliceScore = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < a.size(); i++){
            if(a.get(i)>b.get(i))
            aliceScore++;
            if(a.get(i)<b.get(i))
            bobScore++;
        }
        result.add(aliceScore);
        result.add(bobScore);
        
        return result;
    }

}

