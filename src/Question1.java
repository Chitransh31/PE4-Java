import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter String: ");
            String str = in.nextLine();
            System.out.println("Enter Character: ");
            char ch = in.next().charAt(0);

            System.out.println("Length of string: " + str.length());
            int charCount = str.length() - str.replaceAll(Character.toString(ch), "").length();
            System.out.println("No. of occurrences: " + charCount);
        }
        catch(Exception e) {
            System.out.println("Error!");
        }
    }
}
