class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    //int m = 1;
    for(int i =1; i <= n; i++){
        for(int j=0; j<n-i; j++)
            System.out.print(" ");
        for(int m=0; m<i; m++)
            System.out.print("#");
        System.out.println();
    } 
    }
}
