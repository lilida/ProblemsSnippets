package ProblemsSnippets.Misc;

public class BoxLoader {

    public int mostItems(int boxX, int boxY, int boxZ, int itemX, int itemY, int itemZ) {
        int max = -1;
        int[] box = new int[]{boxX, boxY, boxZ};
        int[] item = new int[]{itemX, itemY, itemZ};

        for (int i = 0; i < 3; i++) {
            int x = box[0] / item[(0 + i) % 3];
            int y = box[1] / item[(1 + i) % 3];
            int z = box[2] / item[(2 + i) % 3];

            if (x * y * z > max)
                max = x * y * z;

        }

        for (int i = 0; i < 3; i++) {
            int x = box[0] / item[(2 + i) % 3];
            int y = box[1] / item[(1 + i) % 3];
            int z = box[2] / item[(0 + i) % 3];

            if (x * y * z > max)
                max = x * y * z;

        }

        return max;
    }
}
