
public class Solution {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0,2));
        String restOfTime = s.substring(2,8);
        char timePeriod = s.charAt(8);
        
        if( timePeriod == 'P'){ 
            if(hour != 12)
                hour += 12;
            
        } else if(timePeriod == 'A'){
            if(hour == 12 ){
               hour = 00;
            }
        }
        
        return String.format( "%02d%s",hour, restOfTime);
    }

}
