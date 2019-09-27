import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        String str = in.nextLine();
        str = str.replaceAll("d","f");
        str = str.replaceAll("l","t");
        System.out.println(str);

    }
}
