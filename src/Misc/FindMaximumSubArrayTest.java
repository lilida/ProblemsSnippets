package ProblemsSnippets.Misc;

import junit.framework.TestCase;

public class FindMaximumSubArrayTest extends TestCase {
    public void testFindMaximumSubArray() throws Exception {
        FindMaximumSubArray sol=new FindMaximumSubArray();
        int[] array=new int[]{-1,-1,3,4,-5,6};
        assertEquals(8,sol.FindMaximumSubArray(array));

        array=new int[]{-1,-1,3,4,-5,-6};
        assertEquals(7,sol.FindMaximumSubArray(array));

        array=new int[]{-1,-1,-3,-4,-5,-6};
        assertEquals(-1,sol.FindMaximumSubArray(array));

        array=new int[]{1,1,3,4,5,6};
        assertEquals(20,sol.FindMaximumSubArray(array));
    }
}
