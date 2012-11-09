package ProblemsSnippets.LinkedLists;

public class RevertLinkedList {

    public static LinkedListNode RevertList(LinkedListNode head){
        LinkedListNode current = head;
        LinkedListNode last = null;
        while (current!=null){
            LinkedListNode next=current.next;
            current.next=last;
            last=current;
            current=next;
        }

        return last;
    }
}
