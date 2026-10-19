import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String firstName = SafeInput.getNonZeroLenString(
                in, "Enter your first name");

        String lastName = SafeInput.getNonZeroLenString(
                in, "Enter your last name");

        String username = SafeInput.getNonZeroLenString(
                in, "Enter your selected username");

        System.out.println("\nYour Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Username: " + username);

        in.close();
    }
}