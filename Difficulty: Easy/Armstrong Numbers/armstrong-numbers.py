class Solution:
    @staticmethod
    def armstrongNumber(n):
        number = n
        total = 0

        while n != 0:
            last = n % 10
            total += last * last * last
            n //= 10

        return number == total
