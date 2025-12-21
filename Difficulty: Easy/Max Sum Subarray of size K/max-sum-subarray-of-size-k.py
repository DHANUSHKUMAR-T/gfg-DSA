class Solution:
    def maxSubarraySum(self, arr, k):
        # sum of first window
        total = 0
        for i in range(k):
            total += arr[i]

        m = 0
        maxi = total

        # slide the window
        for i in range(k, len(arr)):
            total -= arr[m]
            total += arr[i]
            maxi = max(maxi, total)
            m += 1

        return maxi
