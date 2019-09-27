import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String text = in.nextLine();

        System.out.println("Enter pattern: ");
        String pat = in.nextLine();

        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);

        int startIndex = 0, endIndex = -1, i;
        for(i = 0;i < text.length();i++) {
            if(matcher.find(endIndex + 1)) {
                startIndex = matcher.start();
                endIndex = matcher.end();
                System.out.println("Found at: " + startIndex + " - " + endIndex);
            }
        }

    }
}
