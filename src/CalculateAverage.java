public class CalculateAverage {
    /*
    Write a function which calculates the average of the numbers in a given list.

    Note: Empty arrays should return 0.

     */

    public static double find_average(int[] array){
        int sum = 0;
        int counter = 0;
        for(int i=0; i< array.length; i++){
            sum += i;
            counter+= array[i];
        }
        return (double) counter/sum;

    }

    public static void main(String[] args) {
        int [] array = {10,20,30,40,50,60};
        double x = find_average(array);
        System.out.println(x);


    }
}
