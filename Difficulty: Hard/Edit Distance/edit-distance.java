class Solution {
    // public int minOperations(String s1, int idx1, String s2, int idx2, Integer dp[][]){
    //     if(idx1 == 0){
    //         return idx2;
    //     }
    //     if(idx2 == 0){
    //         return idx1;
    //     }
    //     if(dp[idx1][idx2] != null){
    //         return dp[idx1][idx2];
    //     }
    //     int matching = Integer.MAX_VALUE;
    //     int notMatching = Integer.MAX_VALUE;
    //     if(s1.charAt(idx1 - 1) == s2.charAt(idx2 - 1)){
    //         matching = minOperations(s1, idx1 - 1, s2, idx2 - 1, dp);
    //     }
    //     else{
    //         // Three possible operations we can do 
    //         int insert = 1 + minOperations(s1, idx1, s2, idx2 - 1, dp);
    //         int delete = 1 + minOperations(s1, idx1 - 1, s2, idx2, dp);
    //         int replace = 1 + minOperations(s1, idx1 - 1, s2, idx2 - 1, dp);
            
    //         notMatching = Math.min(insert, Math.min(delete, replace));
    //     }
        
    //     return dp[idx1][idx2] = Math.min(matching, notMatching);
        
    // }
    // Space Optimized
    public int editDistance(String s1, String s2) {
        // Code here
        int n = s1.length();
        int m = s2.length();
        // int dp[][] = new int[n + 1][m + 1];
        int prev[] = new int[m + 1];
        for(int idx2=0;idx2<=m;idx2++){
            prev[idx2] = idx2;
        }
        int curr[] = new int[m + 1];
        for(int idx1=1;idx1<=n;idx1++){
            curr[0] = idx1;
            for(int idx2=1;idx2<=m;idx2++){
                int matching = Integer.MAX_VALUE;
                int notMatching = Integer.MAX_VALUE;
                if(s1.charAt(idx1 - 1) == s2.charAt(idx2 - 1)){
                    matching = prev[idx2 - 1];
                }
                else{
                    // Three possible operations we can do 
                    int insert = 1 + curr[idx2 - 1];
                    int delete = 1 + prev[idx2];
                    int replace = 1 + prev[idx2 - 1];
                    
                    notMatching = Math.min(insert, Math.min(delete, replace));
                }
                
                curr[idx2] = Math.min(matching, notMatching);
            }
            int temp[] = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev[m];
    }
}