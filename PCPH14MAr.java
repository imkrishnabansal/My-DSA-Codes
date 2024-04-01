import java.util.Scanner;

public class PCPH14MAr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an Password ");
            String password = scanner.nextLine();

            if (isComplexEnough(password)) {
                System.out.println("Correct");
            } else {
                System.out.println("Too weak");
            }
        }

    public static boolean isComplexEnough(String password) {
        if (password.length() < 5) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        String sc = "!.?_,";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            for (int i = 0; i< sc.length(); i++) {
                if (sc.charAt(i) == ch) {
                    hasSpecialCharacter = true;
                }
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter;
    }
}

// problem 4A ,1A, 6A,411A