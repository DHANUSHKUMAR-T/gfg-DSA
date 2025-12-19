class Solution {
    Node deleteNode(Node head, int pos) {
      Node temp=head;
     if(pos==1){
         head=temp.next;
     }
      for(int i=1;i<pos-1&&temp!=null;i++){
          temp=temp.next;
      }
      temp.next=temp.next.next;
      return head;
    }
}