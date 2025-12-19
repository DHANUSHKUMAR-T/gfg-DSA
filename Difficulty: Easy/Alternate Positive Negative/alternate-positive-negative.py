class Solution:
    def rearrange(self, arr):
        a = []
        b = []

        for x in arr:
            if x >= 0:
                a.append(x)
            else:
                b.append(x)

        arr.clear()

        for i in range(max(len(a), len(b))):
            if i < len(a):
                arr.append(a[i])
            if i < len(b):
                arr.append(b[i])
