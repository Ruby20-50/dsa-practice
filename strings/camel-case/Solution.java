class Solution {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    // Write your code here
    String word="";
    int wordCount=1;
    for(int index = 0 ; index < s.length(); index++){
        word += s.charAt(index);
        if(Character.isUpperCase(s.charAt(index)) ){
            wordCount++;
            word = "";
            word += s.charAt(index);
        }
    }
        return wordCount;
    }
}
