class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int a =0, b = 0;
        for(int i = arr.length - 1; i>=0 ; i--){
            int c = Math.max(arr[i] + b, a);
            b = a;
            a = c;
        }
        return a;
    }
}