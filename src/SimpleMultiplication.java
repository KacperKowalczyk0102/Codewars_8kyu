public class SimpleMultiplication {
    /*
    This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

     */
    public static int simpleMultiplication(int n) {
        int result = 0;
        if (n % 2 == 0) {
            result = n * 8;
        } else {
            result = n * 9;
        }

        return result;
    }
}
