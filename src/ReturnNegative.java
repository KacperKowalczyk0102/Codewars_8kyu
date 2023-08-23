public class ReturnNegative {
    public static int makeNegative(final int x) {
        if (x > 0) {
            return -x;
        } else {
            return x;
        }


    }

    public static void main(String[] args) {
        int i = makeNegative(10);
        System.out.println(i);


    }
}

