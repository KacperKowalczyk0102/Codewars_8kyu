import java.util.Arrays;
import java.util.OptionalInt;

/*
Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that
 receive a list of integers as input, and return the largest and lowest number in that list, respectively.
Examples (Input -> Output)

* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5

 */
public class FindMaximumAndMinimumValuesOfList {
    public static int min(int[] list) {
        int minValue = list[0];
        for(int minimum : list){
            if(minimum < minValue){
                minValue = minimum;
            }
        }
        return minValue;
    }

    public static int max(int[] list) {
            int maxValue = list[0];
            for(int maximum : list){
                if(maximum > maxValue){
                    maxValue = maximum;
                }
            }
            return maxValue;
        }

    public static void main(String[] args) {
        int[] list = {1,11,23,-1,2,8};
        int resultMin = min(list);
        int resultMax = max(list);
        System.out.println("Min: " + resultMin);
        System.out.println("Max: " + resultMax);
    }
}
