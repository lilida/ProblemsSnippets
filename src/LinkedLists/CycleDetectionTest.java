package ProblemsSnippets.LinkedLists;

import junit.framework.TestCase;

public class CycleDetectionTest extends TestCase {
    public void testGetCycleNode() throws Exception {

        LinkedListNode n1=null;

        assertNull(CycleDetection.GetCycleNode(n1));
        n1=new LinkedListNode();

        assertNull(CycleDetection.GetCycleNode(n1));
        n1.next=n1;
        assertEquals(CycleDetection.GetCycleNode(n1),n1);

        n1.next=new LinkedListNode();
        assertNull(CycleDetection.GetCycleNode(n1));
        n1.next.next=new LinkedListNode();
        n1.next.next.next=n1;
        assertEquals(CycleDetection.GetCycleNode(n1),n1);
        n1.next.next.next=n1.next;
        assertEquals(CycleDetection.GetCycleNode(n1),n1.next);
    }
}
