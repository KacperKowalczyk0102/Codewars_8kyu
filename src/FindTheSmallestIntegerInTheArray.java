public class FindTheSmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for(int i =0; i<args.length;i++){
            if(args[i]<smallest){
                smallest = args[i];
            }
        }return smallest;
    }

    public static void main(String[] args) {
        int[] array1 = {34, 15, 88, 2};
        int[] array2 = {34, -345, -1, 100};
        System.out.printf("Najmniejsza wartośc tabeli 1 to: " + findSmallestInt(array1) +"\n");
        System.out.printf("Najmniejsza wartośc tabeli 2 to: " + findSmallestInt(array2));

    }

}
