package ProblemsSnippets.ArrayAndStrings;

import junit.framework.TestCase;

public class ReplaceSpaceTest extends TestCase {
    public void testReplaceWithSpace() throws Exception {

        char[] chs = new char[256];
        String s = "abc";
        System.arraycopy(s.toCharArray(), 0, chs, 0, s.length());
        assertEquals("abc", ReplaceSpace.replaceWithSpace(chs, s.length()));

        chs = new char[256];
        s = "a bc";
        System.arraycopy(s.toCharArray(), 0, chs, 0, s.length());
        assertEquals("a%20bc", ReplaceSpace.replaceWithSpace(chs, s.length()));

        chs = new char[256];
        s = " a bc";
        System.arraycopy(s.toCharArray(), 0, chs, 0, s.length());
        assertEquals("%20a%20bc", ReplaceSpace.replaceWithSpace(chs, s.length()));

        chs = new char[256];
        s = " a bc ";
        System.arraycopy(s.toCharArray(), 0, chs, 0, s.length());
        assertEquals("%20a%20bc%20", ReplaceSpace.replaceWithSpace(chs, s.length()));

    }
}
