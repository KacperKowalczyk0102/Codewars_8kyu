public class RemoveFirstAndLastCharacter {

    /*
     It's pretty straightforward. Your goal is to create a function that
     removes the first and last characters of a string.
     You're given one parameter, the original string.
     You don't have to worry with strings with less than two characters.
    */
    public static String remove(String str) {
        return str.substring(1,str.length()-1);

    }

    public static void main(String[] args) {
        String a = remove("Maroko");
        System.out.println(a);
    }
}
