class Solution:
    def countDistinct(self, arr, k):
        res = []
        freq = {}

        # first window
        for i in range(k):
            freq[arr[i]] = freq.get(arr[i], 0) + 1

        res.append(len(freq))

        left = 0
        for i in range(k, len(arr)):
            # remove left element
            freq[arr[left]] -= 1
            if freq[arr[left]] == 0:
                del freq[arr[left]]
            left += 1

            # add new element
            freq[arr[i]] = freq.get(arr[i], 0) + 1
            res.append(len(freq))

        return res
