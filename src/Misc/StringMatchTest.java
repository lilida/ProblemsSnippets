package ProblemsSnippets.Misc;

import junit.framework.TestCase;

public class StringMatchTest extends TestCase {

    public void testMatch(){
        String s= StringMatch.matchString("abcdefg","cd");
        assertEquals(
                s,
                "cd");

        s= StringMatch.matchString("abcdefg","*");
        assertEquals(
                s,
                "abcdefg");

        s= StringMatch.matchString("abcdefg","a*");
        assertEquals(
                s,
                "abcdefg");

        s= StringMatch.matchString("abcdefg","a*c");
        assertEquals(
                s,
                "abc");
        s= StringMatch.matchString("abcdefg","a.c");
        assertEquals(
                s,
                "abc");

        s= StringMatch.matchString("abcdefg","a..d");
        assertEquals(
                s,
                "abcd");


        assertEquals(
                StringMatch.matchString("abcdefg","a*ef"),
                "abcdef");


        assertEquals(
                StringMatch.matchString("abcdefg","a*d*e"),
                "abcde");
        assertEquals(
                StringMatch.matchString("abcdefg","a*.*e"),
                "abcde");
    }
}
