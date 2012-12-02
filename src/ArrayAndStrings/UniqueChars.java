package ProblemsSnippets.ArrayAndStrings;

public class UniqueChars {

    public static boolean containsOnlyUniqueChars(String str) {
        boolean[] has_chars = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int index = (int) str.charAt(i);
            if (has_chars[(int) str.charAt(i)])
                return false;
            else
                has_chars[(int) str.charAt(i)] = true;
        }

        return true;

    }
}
