import java.util.Scanner;

public class C37_Remove_WhiteSpaces {
    public void RemoveWhiteSpaces(String string) {
        char[] chars = string.toCharArray();
        int j = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && chars[i] != '\t' && chars[i] != '\n')
            {
                chars[j] = chars[i];
                j++;
            }
        }

        // Create new string from valid characters
        String result = new String(chars, 0, j);
        System.out.println("String without whitespaces: " + result);
    }

    public static void main(String[] args) {
        System.out.println("Program to Remove WhiteSpaces from a String");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String to be Checked...!");
        String string = scanner.nextLine();

        scanner.close();

        C37_Remove_WhiteSpaces obj = new C37_Remove_WhiteSpaces();
        obj.RemoveWhiteSpaces(string);
    }
}
