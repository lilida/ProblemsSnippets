package ProblemsSnippets.ArrayAndStrings;

public class RevertString {

    public static void revert(char[] chs) {
        assert (chs != null);
        int start = 0;
        int end = chs.length - 1;

        while (start < end) {
            char temp = chs[start];
            chs[start++] = chs[end];
            chs[end--] = temp;
        }

    }
}
