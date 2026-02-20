import java.util.Scanner;
public class problem7 {
    public static String reverseString(String str) {
    StringBuilder reversed = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
        reversed.append(str.charAt(i));
    }

    return reversed.toString();
}
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        System.out.println("Reversed string: " + reversed.toString());

        input.close();
    }
}
