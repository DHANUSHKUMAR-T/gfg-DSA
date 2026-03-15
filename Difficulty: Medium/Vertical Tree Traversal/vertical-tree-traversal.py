from collections import deque, defaultdict

class Solution:
    def verticalOrder(self, root):
        if not root:
            return []

        q = deque()
        mp = defaultdict(list)

        q.append((root, 0))
        q.append((None, 0))

        while q:
            node, level = q.popleft()

            if node:
                mp[level].append(node.data)

                if node.left:
                    q.append((node.left, level - 1))
                if node.right:
                    q.append((node.right, level + 1))
            else:
                if q and q[0][0] is not None:
                    q.append((None, 0))
                else:
                    break

        result = []
        for key in sorted(mp.keys()):
            result.append(mp[key])

        return result
