class Solution:
    def isPerfect(self, n):
        # code here 
        
        # Method 2
        
        
        # factSum=list(filter(lambda x: n%x==0 ,range(1,n)))
        # return sum(factSum)==n
        
        # Method 1
        
        
        # for i in range(1,n):
            
        #     if n%i==0:
                
        #         factSum.append(i)
                
        # return sum(factSum)==n
        
        # Method 3 
    
        if n <= 1:
            return False
        
        total = 1
        
        i = 2
        while i * i <= n:
            if n % i == 0:
                total += i
                if i != n // i:
                    total += n // i
            i += 1
        
        return total == n