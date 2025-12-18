class Solution {
    public void reverseArray(int arr[]) {

        int rev[] = new int[arr.length];
        int a = 0;

        // store reversed elements
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[a] = arr[i];
            a++;
        }

        // copy back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rev[i];
        }
    }
}