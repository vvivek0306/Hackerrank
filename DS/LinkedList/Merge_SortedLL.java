/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method
    
    Node merge = new Node();
    Node currentA=headA;
    Node currentB=headB;
    Node newHead=new Node();
    if(currentA != null && currentB != null){
    if(headA.data < headB.data){
           merge = currentA;
           currentA=currentA.next;
       }
        else{
            merge=currentB;
            currentB=currentB.next;
           }
        newHead=merge;
    }
    else{
        if(currentA != null && currentB == null){
            newHead=currentA;
        }
        if(currentA == null && currentB != null){
            newHead=currentB;
        }
        if(currentA == null && currentB == null){
            newHead=headA;
        }
    }
    
    while(currentA != null || currentB != null){
        if(currentA != null && currentB != null){
            if(currentA.data<currentB.data){
                merge.next =currentA;
                currentA=currentA.next;
            }
            else{
                merge.next =currentB;
                currentB=currentB.next;
            }
        }
        else{
            if(currentA != null ){
                merge.next=currentA;
                currentA=currentA.next;
            }
            else{
                merge.next =currentB;
                currentB=currentB.next;
            }
        }
        merge=merge.next;
    }
    return newHead;

}
