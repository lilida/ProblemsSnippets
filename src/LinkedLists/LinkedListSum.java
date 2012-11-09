package ProblemsSnippets.LinkedLists;

/*
 *  Adding two linked list
 *  For ex:
 *  1->2->3
 *  2->8>1
 *
 *  Output: 4->0>4
 *
 */
public class LinkedListSum {

    public static LinkedListNode Add(LinkedListNode head1, LinkedListNode head2){
        LinkedListNode newhead1=Revert(head1);
        LinkedListNode newhead2=Revert(head2);
        LinkedListNode current=null;
        int carry = 0;

        while (newhead1 != null || newhead2 !=null){
            LinkedListNode newNode=new LinkedListNode();
            if (current!=null)
                newNode.next=current;
            current=newNode;

            current.value=(newhead1 == null ? 0 : newhead1.value) + (newhead2==null ? 0 :newhead2.value)+carry;
            carry=current.value/10;
            current.value=current.value % 10;

            if (newhead1!=null)
                newhead1=newhead1.next;
            if (newhead2 != null)
                newhead2=newhead2.next;
        }

        return  current;
    }

    public static LinkedListNode Revert(LinkedListNode head){
        if (head == null || head.next == null)
            return head;

        LinkedListNode first=null;
        LinkedListNode second = head;
        while (second!=null){
            LinkedListNode temp=second.next;
            second.next = first;
            first = second;
            second=temp;
        }

        return first;
    }
}
