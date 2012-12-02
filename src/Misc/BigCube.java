package ProblemsSnippets.Misc;


public class BigCube {

    public String largestCube(String[] range) {

        int max = -1;
        long[] cubes = GetCubes();
        for (int i = 0; i < range.length; i++) {
            String[] tokens = range[i].split("-");
            long low = Long.parseLong(tokens[0]);
            long high = Long.parseLong(tokens[1]);
            for (int j = cubes.length - 1; j >= 0 && j > max; j--) {
                if (cubes[j] <= high && cubes[j] >= low) {
                    max = j;
                    break;
                }
            }
        }

        return max == -1 ? "" : Long.toString(cubes[max]);

    }

    public long[] GetCubes() {

        long[] cubes = new long[100001];
        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = (long) i * (long) i * (long) i;
        }
        return cubes;
    }

}
