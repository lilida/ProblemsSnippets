package ProblemsSnippets.Misc;

import junit.framework.TestCase;

import java.util.ArrayList;

public class Problem3SumTest extends TestCase {
    public void testThreeSum() throws Exception {
        Problem3Sum   solution=new Problem3Sum();
        int[] a=new int[]{-1,3,4,5,-2};

        ArrayList<ArrayList<Integer>> ret =solution.threeSum(a);

        assertEquals(1,ret.size());

        a=new int[]{-1,3,4,5,-2,-3};

        ret =solution.threeSum(a);

        assertEquals(3,ret.size());

        a=new int[]{0,4,6,-2,-3};

        ret =solution.threeSum(a);

        assertEquals(0,ret.size());
    }
}
