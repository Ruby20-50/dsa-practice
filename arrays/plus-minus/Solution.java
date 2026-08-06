import java.util.*;

class Solution {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    
    double positive=0;
    double negative=0;
    double zero=0;
    for(int i=0; i<arr.size(); i++){
        if(arr.get(i) > 0)
        positive++;
        else if(arr.get(i) < 0)
        negative++;
        else
        zero++;
    }
    positive /= arr.size();
    negative /= arr.size();
    zero /= arr.size();
    System.out.println(positive +"\n"+negative+"\n"+zero);

    }

}