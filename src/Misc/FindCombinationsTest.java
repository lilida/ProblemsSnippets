package ProblemsSnippets.Misc;

import junit.framework.TestCase;

import java.util.ArrayList;

public class FindCombinationsTest extends TestCase {
    public void testFindCombinations() throws Exception {
        int target = 7;
        int[] numbers = new int[]{2, 3, 7};

        FindCombinations solution = new FindCombinations();
        ArrayList<ArrayList<Integer>> result = solution.FindCombinations(target, numbers);
        assertEquals(2, result.size());

        numbers = new int[]{2, 3, 4, 7};
        result = solution.FindCombinations(target, numbers);
        assertEquals(3, result.size());
    }
}
