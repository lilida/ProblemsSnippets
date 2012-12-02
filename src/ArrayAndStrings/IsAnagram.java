package ProblemsSnippets.ArrayAndStrings;

public class IsAnagram {
    public static boolean isAnagram(String str1, String str2) {
        assert (str1 != null && str2 != null);
        if (str1.length() != str2.length())
            return false;

        int[] charCount1 = new int[128];
        int[] charCount2 = new int[128];

        for (int i = 0; i < str1.length(); ++i) {
            charCount1[(int) str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); ++i) {
            charCount2[(int) str2.charAt(i)]++;
        }

        for (int i = 0; i < 128; ++i) {
            if (charCount1[i] != charCount2[i])
                return false;
        }
        return true;
    }
}
