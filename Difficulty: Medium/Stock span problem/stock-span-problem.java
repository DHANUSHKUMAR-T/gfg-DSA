class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<int[]> s = new Stack<>();
         ArrayList<Integer> lis = new ArrayList<>();
         ArrayList<Integer> lis2 = new ArrayList<>();
         int i=0;
        for(i=0;i<arr.length;i++)
        {
            if(s.size()==0)
            {
                lis.add(i-(-1));
            }
            
            else if(s.size()>0 && arr[i]<s.peek()[0])
            {
                lis.add(i-s.peek()[1]);
            }
            else if(s.size()>0 && arr[i]>=s.peek()[0])
            {
                while(s.size()>0 && arr[i]>=s.peek()[0])
                {
                    s.pop();
                }
                if(s.size()==0)
                 {
                      lis.add(i-(-1));
                 }
                 
                else
                {
                    lis.add(i-s.peek()[1]);
                }
            }
            
            s.push(new int[]{arr[i],i});
        }
        
        return lis;
    }
}

