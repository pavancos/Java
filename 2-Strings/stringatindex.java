// Write a Java program to get the character at the given index within the String
import java.util.Scanner;
public class stringatindex {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        String text = new String(get.nextLine());
        int x=get.nextInt();
        System.out.print(text.charAt(x) + " ");
    }
}
