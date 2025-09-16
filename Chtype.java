import java.util.Scanner;

public class Chtype {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a single character
        char ch = scanner.next().charAt(0);

        // Check character type
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }
    }
}
