class Solution {
    int countTriplet(int arr[]) {
        // code here
      int n=arr.length;
      int count =0;
      Arrays.sort(arr);
   for(int i=n-1;i>=2;i--){
       long c=arr[i];
       int l=0;
       int r=i-1;
       while(l<r){
           long sum=(long) arr[l]+ (long) arr[r];
           if(sum==c){
               count++;
               l++;
               r--;
           }else if(sum<c){
               l++;
               
           }else{
               r--;
           }
       }
   }
      return count;
    }
}