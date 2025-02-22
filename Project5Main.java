/* Command prompts to run this program in Terminal.
// cd /Users/ikeiloegbu/Documents/SCHOOL/CSC6301/PROJECT5
// To compile run: javac Project5Main.java
// To run the following program: java Project5Main */

/*
 * To intiate the javadoc. Go to the directory where your program lives and enter the following. 
 * javadoc Project5Main.java
 * This will create HTML file with instructions to this program.
 * 
 * Seperating the files by classes made it easier to change the code as well as making this program to be better maintenanced 
 * I added a file to handle all stack operations and used its methods in this main file. 
 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

 /**
 * The {@code Project5Main} class is the entry point for a console-based application
 * that manages a collection of integers using a {@link ManageStack} object for storage and
 * a {@link UserInput} object for handling user input.
 *
 * <p>The application prompts the user to enter integer values, adds each valid integer
 * to a stack data structure, and allows for the termination of input through the entry 
 * of the keyword "done". Once input is complete, the application sorts the stack of 
 * integers and displays the sorted integers.</p>
 *
 * <p>This class demonstrates the interaction between user input handling and
 * basic collection management in Java. It highlights the use of a stack for
 * sorting and displaying integer values.</p>
 *
 * <h2>Usage Instructions:</h2>
 * <ol>
 *     <li>Compile the program: {@code javac Project5Main.java UserInput.java ManageStack.java}</li>
 *     <li>Run the program: {@code java Project5Main}</li>
 *     <li>Follow the prompt to input integers, or type 'done' to finish input.</li>
 *     <li>Observe the sorted stack output displayed in the console.</li>
 * </ol>
 *
 * <h3>Example Execution:</h3>
 * <pre>
 * {@code
 * Enter integers. Press enter to enter next integer. (type 'done' to finish):
 * 5
 * 3
 * 8
 * 1
 * done
 * Sorted stack:
 * 1 3 5 8
 * }
 * </pre>
 * <h3>Author:</h3> 
 * <p>Ike Iloegbu</p>
 * 
 * <h3>Version:</h3> 
 * <p>1.1</p>
 * @since Feb 2025
 */

public class Project5Main {
    /**
     * The main method serves as the entry point for the application. It initializes
     * a {@link UserInput} object and a {@link ManageStack} for managing the integers.
     * The method repeatedly prompts the user to enter integers until the termination 
     * keyword ("done") is entered. Once the input is complete, it sorts and displays 
     * the entered integers.
     *
     * @param args command-line arguments passed to the program (not used)
     */
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        ManageStack stackManager = new ManageStack();

        // Get user input and add to the stack
        System.out.println("Enter integers. Press enter to enter next integer. (type 'done' to finish):");
        while (true) {
            Integer number = userInput.getInput();
            if (number == null) break;
            stackManager.pushNode(number);
        }
        // Sort and display the stack

        stackManager.sortStack();
        stackManager.displayStack();
    }
}