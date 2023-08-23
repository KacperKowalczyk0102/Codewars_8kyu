public class ConvertNumberTorReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String [] something = new StringBuilder(String.valueOf(n)).reverse().toString().split("");
        int[] array = new int[something.length];

        for(int i = 0; i< something.length;i++){
            array[i] = Integer.parseInt(something[i]);

        }
        return array;

    }
}
