import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(values);
        System.out.print("Shuffled Array: ");
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int integerValue = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equivalent to " + integerValue);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        boolean isPangram = isPangram(inputSentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static void shuffleArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int value : array) {
            list.add(value);
        }
        Collections.shuffle(list);
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    public static int romanToInteger(String s) {
        return 0; // Implement the Roman numeral to integer conversion logic here
    }

    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (sentence.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }
}
