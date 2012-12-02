package ProblemsSnippets.ArrayAndStrings;

import junit.framework.TestCase;

public class IsAnagramTest extends TestCase {
    public void testIsAnagram() throws Exception {
        assertTrue(IsAnagram.isAnagram("cat", "tac"));
        assertFalse(IsAnagram.isAnagram("cat", "ca"));
        assertTrue(IsAnagram.isAnagram("a", "a"));
        assertTrue(IsAnagram.isAnagram("aacbcb", "abcbca"));
    }
}
