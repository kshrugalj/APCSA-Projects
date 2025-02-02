import java.util.Scanner;

public class apcsaw14tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entry = "";

        while (!entry.toLowerCase().equals("stop")) {
            System.out.println("Enter a word");
            entry = sc.nextLine();
            int start = 0;
            int end = entry.length() - 1;
            boolean isAPalindrome = true;

            for (; start <= end; start++, end--) {
                if (!entry.substring(start, start + 1).equals(entry.substring(end, end + 1))) {
                    isAPalindrome = false;
                    break;
                }
            }

            if (isAPalindrome)
                System.out.println("\"" + entry + "\" is a palindrome");
            else
                System.out.println("\"" + entry + "\" is not a palindrome");
        }
        sc.close();
    }
}
