package ProblemsSnippets.ArrayAndStrings;

public class RemoveDuplicates {

    public static String removeDuplicatesInPlace(char[] str) {

        assert (str != null);
        boolean[] hasChars = new boolean[128];
        int fillPos = 0;

        for (int i = 0; i < str.length; ++i) {
            int index = (int) str[i];
            if (!hasChars[index]) {
                str[fillPos++] = (char) index;
                hasChars[index] = true;
            }
        }

        return new String(str, 0, fillPos);

    }
}
