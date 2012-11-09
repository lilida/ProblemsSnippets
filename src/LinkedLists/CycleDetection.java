package ProblemsSnippets.LinkedLists;

public class CycleDetection {

    /**
     * If there is a cycle,  return the start node
     * If there is no cycle, return null
     * @param head
     * @return
     */
    public static  LinkedListNode GetCycleNode(LinkedListNode head){
        if (head==null || head.next ==null)
            return null;
        LinkedListNode p1=head;
        LinkedListNode p2=head;

        p1=p1.next;
        p2=p2.next == null ? null : p2.next.next;

        while (p2!=null && p1!=p2){
            p1=p1.next;
            p2=p2.next == null ? null : p2.next.next;
        }

        if (p2==null)
            return null;
        p1=head;
        while (p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;


    }
}
