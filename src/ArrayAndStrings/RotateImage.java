package ProblemsSnippets.ArrayAndStrings;

public class RotateImage {
    public static void rotate90ClockWise(int[][] image) {

        for (int col = 0; col < image[0].length; col++) {
            for (int row = 0; row < col; row++) {
                int temp = image[row][col];
                image[row][col] = image[col][row];
                image[col][row] = temp;
            }
        }


        for (int i = 0; i < image[0].length / 2; ++i) {
            for (int j = 0; j < image.length; ++j) {
                int temp = image[j][i];
                image[j][i] = image[j][image[0].length - 1 - i];
                image[j][image[0].length - 1 - i] = temp;
            }
        }

    }
}
