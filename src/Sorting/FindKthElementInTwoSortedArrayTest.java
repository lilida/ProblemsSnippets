package ProblemsSnippets.Sorting;

import junit.framework.TestCase;

public class FindKthElementInTwoSortedArrayTest extends TestCase {
    public void testFindKthElement() throws Exception {
        int[] a= {1};
        int[] b= {2};

        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,1),1);
        a=new int[0];
        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,1),2);
        a = new int[]{1,3,4,5,6,7};

        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,4),4);

        b=new int[] {2,8,9,10,11};

        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,4),4);

        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,10),10);

        b=new int[] {2,8,9,10,11,12};

        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,12),12);

        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,3),3);

        a = new int[]{1,3,4,5,6,7,12};

        assertEquals(FindKthElementInTwoSortedArray.findKthElement(a,b,13),12);
    }
}
