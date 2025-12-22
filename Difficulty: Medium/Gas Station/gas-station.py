class Solution:
    def startStation(self, gas, cost):
        n = len(gas)
        deficit = 0
        balance = 0
        start = 0

        for i in range(n):
            balance += gas[i] - cost[i]

            if balance < 0:
                deficit += balance
                start = i + 1
                balance = 0

        total = deficit + balance
        return start if total >= 0 else -1
