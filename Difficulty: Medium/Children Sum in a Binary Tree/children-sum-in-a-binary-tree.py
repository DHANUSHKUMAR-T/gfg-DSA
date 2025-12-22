class Solution:
    def childsum(self, root, ans):
        if not ans[0]:
            return
        if root is None:
            return
        if root.left is None and root.right is None:
            return
        elif root.left is None and root.right is not None and root.right.data != root.data:
            ans[0] = False
            return
        elif root.right is None and root.left is not None and root.left.data != root.data:
            ans[0] = False
            return
        elif root.left is not None and root.right is not None:
            if root.data != root.left.data + root.right.data:
                ans[0] = False
                return

        self.childsum(root.left, ans)
        self.childsum(root.right, ans)

    def isSumProperty(self, root):
        ans = [True]
        self.childsum(root, ans)
        return ans[0]
