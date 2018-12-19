package pkg;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner (System.in);
    public static void choice() {
        String x;
        System.out.println("Enter 1 for lowercase first or 2 for UPPERCASE first");
        x = in.nextLine();
        if (x.equals("1")) {
            LOWER_FIRST();
        } else if (x.equals("2")){
            UPPER_FIRST();
        } else {
            System.out.println("Invalid input, please try again");
            choice();
        }
    }
    public static void LOWER_FIRST() {

        System.out.println("Input text");
        String sentence = in.nextLine();
        char[] array;

        array = sentence.toCharArray(); //put the sentence into a character array

        for (int x = 0; x < array.length; x++) {
            if (array[x] == ' ') { //if the character is blank, move to the next index
                x++;
            }
            array[x] = Character.toUpperCase(array[x]);
        }

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] == ' ') { //if the character is blank, move to the next index
                i++;
            }
            array[i] = Character.toLowerCase(array[i]); //capitalize

        }

        sentence = new String(array); //revert array back to String
        System.out.println(sentence); //display
        System.out.println("");
        choice();
    }
    public static void UPPER_FIRST(){
        System.out.println("Input text");
        String sentence = in.nextLine();
        char[] array;

        array = sentence.toCharArray(); //put the sentence into a character array

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] == ' ') { //if the character is blank, move to the next index
                i++;
            }
            array[i] = Character.toUpperCase(array[i]); //capitalize

        }

        sentence = new String(array); //revert array back to String
        System.out.println(sentence); //display
        System.out.println("");
        choice();
    }

    public static void main(String[] args) {
        choice();
    }
}
