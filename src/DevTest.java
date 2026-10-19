import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String result = SafeInput.getRegExString(
                in,
                "Enter exactly five digits",
                "\\d{5}"
        );

        System.out.println("Your input is: " + result);

        in.close();
    }
}