package ProblemsSnippets.LinkedLists;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: lidali
 * Date: 8/27/12
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlattenListTest extends TestCase {
    public void testFlatten() throws Exception {

        assertNull(FlattenList.Flatten(null));
        FlattenList list=new FlattenList();
        FlattenList.Node head = list.GetSample();
        FlattenList.Node n=FlattenList.Flatten(head);
        int i=1;
        while (head.next!=null){
            assertEquals(head.value,i);
            i++;
            head=head.next;
        }

    }
}
