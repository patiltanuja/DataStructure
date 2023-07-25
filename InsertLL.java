/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode solve(ListNode A, int B, int C) {
      int index=1;
        // class Node{
        //     int data;
        //     int next;
        //     Node(int data){
        //         this.data = data;
        //         this.next=next;
        //     }
        // }
       
      ListNode XN = new ListNode(B);
       ListNode headKaTemp =A;
       if(C == 0){
           XN.next =  A;
            A = XN;
           return  A;
       }else{
           
           while(index < C){
               if(headKaTemp.next ==null){
                headKaTemp.next=XN;
                return A;
               }
            headKaTemp= headKaTemp.next;
             index++;
           }
       
       XN.next =  headKaTemp.next;
        headKaTemp.next =XN;
        
       }
       
       return  A; 
    }
}


















