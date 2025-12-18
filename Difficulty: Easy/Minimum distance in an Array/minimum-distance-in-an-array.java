class Solution {
    int minDist(int arr[], int x, int y) {
        int l=Integer.MAX_VALUE, i1=-1,i2=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                i1=i;
            }
            if(arr[i]==y){
                i2=i;
            }
            if(i1!=-1 && i2!=-1){
                l=Math.min(l,Math.abs(i1-i2));
            }
        }
        return l==Integer.MAX_VALUE ? -1: l;
    }
}