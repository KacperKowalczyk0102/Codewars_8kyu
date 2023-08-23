public class BeginnerLostWithoutMap {
    public static int[] map(int[] arr) {
        int[] map = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            map[i] = arr[i] * 2;
        }

        return map;
    }
}

