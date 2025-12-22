class Solution:
    def solve(self, arr, target):
        # count of subsets with given sum
        n = len(arr)
        dp = [[0] * (target + 1) for _ in range(n + 1)]

        count = 0
        dp[0][0] = 1

        for i in range(1, n + 1):
            if arr[i - 1] == 0:
                count += 1
            dp[i][0] = 2 ** count

        for i in range(1, n + 1):
            for j in range(1, target + 1):
                if arr[i - 1] <= j:
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j]
                else:
                    dp[i][j] = dp[i - 1][j]

        return dp[n][target]

    def countPartitions(self, arr, d):
        total_sum = sum(arr)

        if total_sum - d < 0 or (total_sum - d) % 2 == 1:
            return 0

        target = (total_sum + d) // 2
        return self.solve(arr, target)
