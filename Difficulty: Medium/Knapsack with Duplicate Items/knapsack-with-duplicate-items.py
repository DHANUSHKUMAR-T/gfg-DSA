class Solution:
    def knapSack(self, val, wt, capacity):
        n = len(val)
        prev = [0] * (capacity + 1)

        # Base case
        for j in range(capacity + 1):
            if wt[0] <= j:
                prev[j] = (j // wt[0]) * val[0]
            else:
                prev[j] = 0

        # DP computation (Unbounded Knapsack)
        for i in range(1, n):
            for j in range(capacity + 1):
                notPick = prev[j]
                pick = -10**9
                if wt[i] <= j:
                    pick = val[i] + prev[j - wt[i]]
                prev[j] = max(notPick, pick)

        return prev[capacity]
