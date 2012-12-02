package ProblemsSnippets.ArrayAndStrings;

public class ReplaceSpace {

    //Assumber length is a buffer large enough
    public static String replaceWithSpace(char[] str, int length) {
        assert (length >= 0 && str != null);
        int newLength = length;
        for (char c : str) {
            if (c == ' ')
                newLength += 2;
        }

        int fillPos = newLength - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                str[fillPos--] = str[i];
            } else {
                str[fillPos--] = '0';
                str[fillPos--] = '2';
                str[fillPos--] = '%';
            }
        }

        return new String(str, 0, newLength);

    }
}
