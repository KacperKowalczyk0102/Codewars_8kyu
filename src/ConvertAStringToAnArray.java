import java.util.Arrays;

public class ConvertAStringToAnArray {
    /*
    Write a function to split a string and convert it into an array of words.
Examples (Input ==> Output):

"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]


     */

    public static String[] stringToArray(String s) {
       String[] arr =s.split(" ");
        return arr;
    }

}
