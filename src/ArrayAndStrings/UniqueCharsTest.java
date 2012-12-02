package ProblemsSnippets.ArrayAndStrings;

import junit.framework.TestCase;

public class UniqueCharsTest extends TestCase {
    public void testContainsOnlyUniqueChars() throws Exception {

        assertTrue(UniqueChars.containsOnlyUniqueChars("a"));
        assertFalse(UniqueChars.containsOnlyUniqueChars("aa"));
        assertTrue(UniqueChars.containsOnlyUniqueChars("abcdefg"));
        assertFalse(UniqueChars.containsOnlyUniqueChars("abcdefgc"));
        assertFalse(UniqueChars.containsOnlyUniqueChars("abcdefgcg"));
    }
}
