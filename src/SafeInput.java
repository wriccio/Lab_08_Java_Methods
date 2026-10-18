import java.util.Scanner;

public class SafeInput {

    /**
     * Get a String that is not zero length.
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    /**
     * Get an int value with no constraints.
     *
     * @param pipe Scanner instance to read data from System.in
     * @param prompt input prompt message
     * @return unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }

        } while (!done);

        return retVal;
    }

    /**
     * Get a double value with no constraints.
     *
     * @param pipe Scanner instance to read data from System.in
     * @param prompt input prompt message
     * @return unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }

        } while (!done);

        return retVal;
    }

    /**
     * Get an integer within an inclusive range.
     *
     * @param pipe Scanner instance to read input
     * @param prompt input prompt message
     * @param low lowest acceptable value
     * @param high highest acceptable value
     * @return an integer within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter an integer between "
                            + low + " and " + high + ".");
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }

        } while (!done);

        return retVal;
    }
}
