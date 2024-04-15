import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = toLowerCaseRecursive(input);
        System.out.println(output);
    }

    public static String toLowerCaseRecursive(String str) {
        if (str.isEmpty()) {
            return str;
        }

        char firstChar = str.charAt(0);
        char lowerCaseChar = Character.isUpperCase(firstChar) ? Character.toLowerCase(firstChar) : firstChar;

        return lowerCaseChar + toLowerCaseRecursive(str.substring(1));
    }
}
