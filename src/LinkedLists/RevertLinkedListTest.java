package ProblemsSnippets.LinkedLists;

import junit.framework.TestCase;

public class RevertLinkedListTest extends TestCase {

    public void testRevertList(){
        assertEquals(RevertLinkedList.RevertList(null),null);
        LinkedListNode node=new LinkedListNode();
        LinkedListNode head=node;
        node.value=0;
        assertEquals(RevertLinkedList.RevertList(node),node);
        node.next=new LinkedListNode();
        node=node.next;
        node.value=1;

        node.next=new LinkedListNode();
        node=node.next;
        node.value=2;

        node.next=new LinkedListNode();
        node=node.next;
        node.value=3;

        LinkedListNode revertHead=RevertLinkedList.RevertList(head);
        assertEquals(revertHead.value,3);
        assertEquals(revertHead.next.value,2);
        assertEquals(revertHead.next.next.value,1);
        assertEquals(revertHead.next.next.next.value,0);
        assertEquals(revertHead.next.next.next.next,null);


    }
}
