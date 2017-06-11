/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    
    Node prev=new Node();
    prev=null;
    Node current = new Node();
    Node forward = new Node();
    if(head == null){
        return head;
    }
    else{
        current = head;
    while (current != null){
        forward = current.next;
        current.next=prev;
        prev=current;
        current=forward;
    }
    return prev;
    }
}
