import java.util.Scanner;

/*
 * * To intiate the javadoc. Go to the directory where your program lives and enter the following. 
 * javadoc UserInput.java
 */
/**
 * The {@code UserInput} class provides a mechanism to read integer input 
 * from the standard input stream (usually the keyboard). It utilizes 
 * the {@link java.util.Scanner} class to read and parse user input.
 *
 * <p>This class is useful for scenarios where there is a need to continuously 
 * prompt the user for integer input and handle cases where input is completed 
 * by entering a specific string ("done" in this case).</p>
 *
 * <p>The class handles invalid input gracefully by recursively prompting the user 
 * until a valid integer is entered or the termination keyword "done" is received.</p>
 *
 * <h2>Usage Examples:</h2>
 * <pre>
 * {@code
 * UserInput userInput = new UserInput();
 * Integer userNumber;
 * while ((userNumber = userInput.getInput()) != null) {
 *     // Process the valid integer input
 *     System.out.println("You entered: " + userNumber);
 * }
 * System.out.println("Input process terminated by 'done'");
 * }
 * </pre>
 * 
 * <h3>Author:</h3> 
 * <p>Ike Iloegbu</p>
 * 
 * <h3>Version:</h3> 
 * <p>1.1</p>
 * @since Feb 2025
 */

public class UserInput {
    /** 
     * A {@link Scanner} object to read user input from the standard input stream.
     */
    private Scanner sc;

    /**
     * Constructs a {@code UserInput} instance and initializes the 
     * {@link Scanner} object to read from {@code System.in}.
     */
    public UserInput(){
        sc = new Scanner(System.in);

    }

    /**
     * Prompts the user to enter an integer. If the user inputs a valid integer, 
     * it returns the integer. If the user inputs the string "done", it returns 
     * {@code null} signaling the end of input. If an invalid input is entered, 
     * it prompts the user again until a valid integer or "done" is entered.
     *
     * @return an {@code Integer} entered by the user, or {@code null} if the 
     *         user enters "done".
     */
    public Integer getInput() {
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("done")) {
            return null;
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            return getInput(); // Retry till valid input
        }
    }
}
