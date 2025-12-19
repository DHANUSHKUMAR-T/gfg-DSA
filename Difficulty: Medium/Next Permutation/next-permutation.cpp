class Solution {
  public:
    void nextPermutation(vector<int>& arr) {
        // code here
        int n = arr.size();
        int loc=0,i;
        for(i = n-2; i>=0; i--){
            int num = arr[i];
            for(int j = n-1; j > i; j--){
                if(arr[j] > num){
                    loc = i;
                    swap(arr[j], arr[i]);
                    sort(arr.begin() + i+1, arr.end());
                    return;
                }
            }
        }
        if(i <= 0) sort(arr.begin(), arr.end());
    }
};
