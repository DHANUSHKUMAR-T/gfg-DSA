class Solution:
    def intersectSize(self,a, b):
        count=0
        x = a+b
        a = max(x)
        hash = [0]*a
        for i in x:
            hash[i-1]+=1
        
        for i in range(len(hash)):
            if hash[i]==2:
                count+=1
        return count