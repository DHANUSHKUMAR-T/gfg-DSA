class Solution: 
    def selectionSort(self, arr):
        for i in range(0,len(arr)):
            minimum = i
            for j in range(i+1,len(arr)):
                if arr[j] < arr[minimum]:
                    minimum = j
            arr[i],arr[minimum] = arr[minimum],arr[i]
        return arr