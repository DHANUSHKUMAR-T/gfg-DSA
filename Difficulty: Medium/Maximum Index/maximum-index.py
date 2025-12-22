class Solution:
    def maxIndexDiff(self, arr):
        n = len(arr)

        l = [0] * n
        r = [0] * n

        l[0] = arr[0]
        r[n - 1] = arr[n - 1]

        for i in range(1, n):
            l[i] = min(l[i - 1], arr[i])

        for i in range(n - 2, -1, -1):
            r[i] = max(r[i + 1], arr[i])

        i = 0
        j = 0
        maxim = float('-inf')

        while i < n and j < n:
            if l[i] <= r[j]:
                maxim = max(maxim, j - i)
                j += 1
            else:
                i += 1

        return maxim
