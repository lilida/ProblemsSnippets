package ProblemsSnippets.LinkedLists;

import junit.framework.TestCase;

public class LinkedListSumTest extends TestCase {
    public void testAdd() throws Exception {
         LinkedListNode h1=null;
         LinkedListNode h2=null;

         assertNull(LinkedListSum.Add(h1,h2));

         h1=new LinkedListNode(3);

         LinkedListNode result =LinkedListSum.Add(h1,h2);
         assertEquals(result.value,3);
         assertNull(result.next);



         //h1 is 3->4->5

        h1=new LinkedListNode(3);
        h1.next=new LinkedListNode(4);
        h1.next.next=new LinkedListNode(5);

         h2=new LinkedListNode(5);
         result =LinkedListSum.Add(h1,h2);
         assertEquals(result.value,3);
         assertEquals(result.next.value,5);
         assertEquals(result.next.next.value,0);

         h2=new LinkedListNode(5);
         h2.next=new LinkedListNode(4);
         h2.next.next=new LinkedListNode(5);

        h1=new LinkedListNode(3);
        h1.next=new LinkedListNode(4);
        h1.next.next=new LinkedListNode(5);

         //h2 is 5->4->5
        result =LinkedListSum.Add(h1,h2);
        assertEquals(result.value,8);
        assertEquals(result.next.value,9);
        assertEquals(result.next.next.value,0);


    }
}
