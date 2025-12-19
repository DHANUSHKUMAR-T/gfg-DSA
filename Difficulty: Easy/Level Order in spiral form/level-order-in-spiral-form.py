from collections import deque

class Solution:
    def findSpiral(self, root):
        if not root:
            return []

        q = deque()
        ans = []
        st = []
        i = -1

        q.append(root)

        while q:
            size = len(q)
            i += 1

            while size > 0:
                temp = q.popleft()

                if i % 2 != 0:
                    ans.append(temp.data)
                else:
                    st.append(temp.data)

                if temp.left:
                    q.append(temp.left)
                if temp.right:
                    q.append(temp.right)

                size -= 1

            while st:
                ans.append(st.pop())

        return ans
