import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String text = in.nextLine();

        Pattern pattern = Pattern.compile("\\s*(Harry)\\s*");
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()) {
            System.out.println("Is Harry here ? True");
        }
        else {
            System.out.println("Is Harry here ? False");
        }
    }
}
