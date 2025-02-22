import java.util.Collections;
import java.util.Stack;

/*
 * * To intiate the javadoc. Go to the directory where your program lives and enter the following. 
 * javadoc ManageStack.java
 */
/**
* In this code, I reused functionality that exists in Java Development Kit.
* I made use of the Stack functionality and Collections.sort method. 

* The {@code ManageStack} class provides functionality to store a collection
* of integers in a stack structure, sort the list, and display the elements.
*
* <p>This class makes use of the {@link java.util.Stack} from the Java
* Collections Framework to manage the list of integers. It provides methods to:
* <ul>
*     <li>Add elements to the stack</li>
*     <li>Sort the stack in ascending order</li>
*     <li>Display elements of the stack</li>
* </ul>
*
* <p>The {@code main()} method demonstrates a simple use case where integers are input
* from the user, added to the stack, sorted, and then displayed.</p>
*
*
 * <h2>Author:</h2> 
 * <p>Ike Iloegbu</p>
 * 
 * <h3>Version:</h3> 
 * <p>1.1</p>
* @since Feb 2025
*/

public class ManageStack {

    /**
     * A stack data structure to store integer values.
     * @param accepts a single integer to a node generating a stack.
     */
    // This code creates an instance of Stack<Integer> to store integers. 
    // This is an expample of reusing existing functionality from Java Std library.
    private Stack<Integer> stack;

    /**
     * Constructs an empty {@code ManageStack} instance.
     * Initializes the internal stack.
     */

    public ManageStack(){
        stack = new Stack<>();
    }

    /**
     * Pushes a new integer to the stack.
     *
     * @param data the integer to be added to the stack
     */
    public void pushNode(int data) {
        stack.push(data);
    }

     /**
     * Sorts the elements of the stack in ascending order.
     *
     * <p>This method utilizes the {@link java.util.Collections#sort} method
     * which provides efficient sorting of the list elements.</p>
     */
    public void sortStack(){
        Collections.sort(stack);
    }

    /**
     * Displays the elements of the stack to the standard output.
     *
     * <p>Each element in the stack is printed on the same line followed by a space.</p>
     */

    public void displayStack(){
        for (Integer number: stack){
            System.out.print(number + " ");
        }
        System.out.println();
    }

}
