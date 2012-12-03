package ProblemsSnippets.ArrayAndStrings;

import junit.framework.TestCase;

public class RotateImageTest extends TestCase {
    public void testRotate90ClockWise() throws Exception {
        int[][] a = new int[][]{
                {1, 1, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0},
                {1, 0, 0, 0}
        };

        int[][] b = new int[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 1, 1}
        };

        RotateImage.rotate90ClockWise(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                assertEquals(a[i][j], b[i][j]);
            }
        }
    }
}
