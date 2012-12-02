package ProblemsSnippets.ArrayAndStrings;

import junit.framework.TestCase;

public class RevertStringTest extends TestCase {
    public void testRevert() throws Exception {
        char[] x = "abc".toCharArray();
        RevertString.revert(x);

        assertEquals("cba", new String(x));

        x = "a".toCharArray();
        RevertString.revert(x);
        assertEquals("a", new String(x));

        x = "ab".toCharArray();
        RevertString.revert(x);
        assertEquals("ba", new String(x));

        x = "abcdefgada".toCharArray();
        RevertString.revert(x);
        assertEquals("adagfedcba", new String(x));
    }
}
