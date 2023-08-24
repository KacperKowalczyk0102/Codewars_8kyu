import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {

    /*
    Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.
Example

For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

     */

    public static int[] countPositivesSumNegatives(int[] input)
        {
            if(input == null || input.length ==0){
                return new int[0];
            }

            int count = 0;
            int sum = 0;
            for (int i = 0; i<input.length;i++){
                if(input[i]>0){
                    count++;
                }else if(input[i]<0){
                    sum += input[i];
                }
            }
            return new int[]{count,sum};

    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] result = countPositivesSumNegatives(input);
        System.out.println("Result "+ Arrays.toString(result));
    }
}
