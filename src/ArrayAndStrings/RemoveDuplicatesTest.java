package ProblemsSnippets.ArrayAndStrings;

import junit.framework.TestCase;

public class RemoveDuplicatesTest extends TestCase {
    public void testRemoveDuplicatesInPlace() throws Exception {

        assertEquals("abc", RemoveDuplicates.removeDuplicatesInPlace("abc".toCharArray()));
        assertEquals("abc", RemoveDuplicates.removeDuplicatesInPlace("abcabcabcabc".toCharArray()));
        assertEquals("abc", RemoveDuplicates.removeDuplicatesInPlace("aabbcc".toCharArray()));
    }
}
