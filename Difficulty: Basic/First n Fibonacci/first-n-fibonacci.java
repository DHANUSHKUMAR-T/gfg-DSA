class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int fqi[] = new int[n];
        int num1 = 0, num2 =1;
        int sum = 0;
        
        for(int i =0 ;i< n;i++){
            fqi[i] = num1;
            sum = num1 +num2;
            num1 = num2;
            num2 = sum;
            
        }
        return fqi;
    }
}