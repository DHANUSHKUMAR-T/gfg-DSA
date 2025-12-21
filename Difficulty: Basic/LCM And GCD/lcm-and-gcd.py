class Solution:
    def lcmAndGcd(self, a : int, b : int) -> List[int]:
        # code here
        x,y = abs(a), abs(b)
        while y!=0:
            x,y = y,x%y
        gcd = x
        if a==0 or b==0:
            lcm = 0
        else:
            lcm= abs(a*b)//gcd
        return [lcm,gcd]