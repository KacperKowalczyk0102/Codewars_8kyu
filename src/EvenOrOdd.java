import javax.swing.*;

public class EvenOrOdd {
    /*Create a function that takes an integer as an argument and
    returns "Even" for even numbers or "Odd" for odd numbers. */
    public static String even_or_odd(int number) {
       if(number %2==0){
           return "Even";
       }else{
           return "Odd";
       }
    }

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 7;
        System.out.println("Number 1: " + even_or_odd(number1) +"\n" + "Number 2: " + even_or_odd(number2));
    }
}
