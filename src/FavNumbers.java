import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favoriteInt = SafeInput.getInt(
                in, "Enter your favorite integer");

        double favoriteDouble = SafeInput.getDouble(
                in, "Enter your favorite double");

        System.out.println("\nYour Favorite Numbers:");
        System.out.println("Favorite Integer: " + favoriteInt);
        System.out.println("Favorite Double: " + favoriteDouble);

        in.close();
    }
}
