class Solution {

  public:

    int findWays(int n,int open=0) {

        if(open>n)return 0;

        if(n==1){

            if(open==1)return 1;

            return 0;

        }

        int o=0, c=0;

        o=findWays(n-1,open+1);           

        if(open>0)c=findWays(n-1,open-1);

        return o+c;

    }

};