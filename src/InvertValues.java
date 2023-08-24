public class InvertValues {
    public static int[] invert(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = -array[i];
        }
        return result;
    }
    /*
    public class InvertValues {
  public static int[] invert(int[] array) {

  for(int i = 0; i < array.length; i++) {
    array[i] *= -1;
  }

  return array;
  }
}
     */

    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5};
        int[] additiveInverse = invert(array);

        for(int num : array){
            System.out.println(num + " ");

        }
        System.out.println(" ");

        for(int num2 : additiveInverse){
            System.out.println(num2 + " ");

        }

    }
}
