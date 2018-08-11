package pkg;
import java.util.Scanner;

public class Main {

    public static void actualMain() {
        Scanner in = new Scanner (System.in);
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
        actualMain();
    }

    public static void main(String[] args) {
        actualMain();
    }
}
