class myQueue:
    def __init__(self, n):
        self.arr = []
        self.n = n   # capacity

    def isEmpty(self):
        return len(self.arr) == 0

    def isFull(self):
        return len(self.arr) == self.n

    def enqueue(self, x):
        if self.isFull():
            return -1
        self.arr.append(x)

    def dequeue(self):
        if self.isEmpty():
            return -1
        return self.arr.pop(0)

    def getFront(self):
        if self.isEmpty():
            return -1
        return self.arr[0]

    def getRear(self):
        if self.isEmpty():
            return -1
        return self.arr[-1]