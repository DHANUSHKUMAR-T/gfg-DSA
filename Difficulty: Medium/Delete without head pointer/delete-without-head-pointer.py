class Solution:
    def deleteNode(self, del_node):
        # copy data from next node
        del_node.data = del_node.next.data
        # bypass the next node
        del_node.next = del_node.next.next
