import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String text = in.nextLine();

        String[] words = text.split("[\\s,.'\"?()]");
        List<String> wordList = Arrays.asList(words);

        Collections.sort(wordList);
        System.out.println(wordList);

    }
}
