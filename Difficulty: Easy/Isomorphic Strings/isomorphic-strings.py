class Solution:
    def areIsomorphic(self, s1, s2):
        if len(s1) != len(s2):
            return False

        mp1 = {}
        mp2 = {}

        for c1, c2 in zip(s1, s2):
            if c1 in mp1:
                mp1[c1].add(c2)
            else:
                mp1[c1] = {c2}

            if c2 in mp2:
                mp2[c2].add(c1)
            else:
                mp2[c2] = {c1}

        for v in mp1.values():
            if len(v) > 1:
                return False

        for v in mp2.values():
            if len(v) > 1:
                return False

        return True
