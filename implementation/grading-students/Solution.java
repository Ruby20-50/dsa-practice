import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        
        List<Integer> list = new ArrayList<Integer>();
    for(int studentGd : grades){
        if(studentGd > 37 && studentGd % 5 >= 3){
            
            studentGd = ((studentGd + 5)/5) * 5;
        }   
        list.add(studentGd);  
    }
    return list;
    }

}
