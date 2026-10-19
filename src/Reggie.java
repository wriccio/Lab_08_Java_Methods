import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(
                in,
                "Enter your Social Security Number (###-##-####)",
                "^\\d{3}-\\d{2}-\\d{4}$"
        );

        String mNumber = SafeInput.getRegExString(
                in,
                "Enter your UC Student M number (M#####)",
                "^(M|m)\\d{5}$"
        );

        String menuChoice = SafeInput.getRegExString(
                in,
                "Enter a menu choice: Open (O), Save (S), View (V), or Quit (Q)",
                "^[OoSsVvQq]$"
        );

        System.out.println("\nYour Validated Information:");
        System.out.println("SSN: " + ssn);
        System.out.println("UC Student M Number: " + mNumber);

        switch (menuChoice.toUpperCase()) {
            case "O":
                System.out.println("Menu choice: Open");
                break;
            case "S":
                System.out.println("Menu choice: Save");
                break;
            case "V":
                System.out.println("Menu choice: View");
                break;
            case "Q":
                System.out.println("Menu choice: Quit");
                break;
        }

        in.close();
    }
}
