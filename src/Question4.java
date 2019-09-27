import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static String transpose(String s) {
        StringBuilder sb = new StringBuilder();
        sb.setLength(s.length());
        for (int i = 0, j = s.length() - 1; i <= j; ) {
            sb.setCharAt(i, s.charAt(j));
            sb.setCharAt(j, s.charAt(i));
            i++;
            j--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String text = in.nextLine();

        String[] words = text.split("[\\s,.'\"?()]");
        for(int i = 0;i < words.length;i++) {
            words[i] = transpose(words[i]);
        }
        System.out.println(Arrays.toString(words));
    }
}
