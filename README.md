
## Table of Contents
- [Description](#description)
- [Features](#features)
- [How to Run](#how-to-run)
- [Example Input and Output](#step-3-example-input-and-output)
- [Generating Javadoc](#step-4-generating-javadoc)
- [How to Access the Project](#how-to-access-the-project)
- [Dependencies](#dependencies)


## Description
Java application designed to manage a collection of integers using a stack data structure. The application allows users to input integer values, collects them in a 'stack', and enables sorting and displaying of the stack's contents. The program is structured to facilitate easy code maintenance by separating concerns using auxiliary classes like:
- ManageStack: For stack operations and
- UserInput: For input handling.

It demonstrates the use of:
- Java Collections Framework (`Stack` and `Collections.sort()`)
- Standard input reading with `Scanner`

## Features
- Integer Collection: Allows users to input integers for storage in a 'Stack'.
- User Interaction: Accepts user input and terminates input collection upon the keyword "done".
- Sorting: Sorts the stack of integers using 'Collections.sort()' after input collection is complete.
- Modular Design: Uses separate classes to handle stack operations and user input, improving maintainability and readability.
- Documentation: Generates Javadoc documentation, providing detailed usage instructions through HTML files.
  

## How to Run

### Step 1: Compilation
Use the following command to compile the program:
```sh
javac Project5Main.java
```

### Step 2: Execution
Run the compiled program with:
```sh
java Project5Main
```

### Step 3: Example Input and Output
**Input:**
```
Enter integers. Press enter to enter next integer. (type 'done' to finish):
5
3
8
1
done

```

**Output:**
```
Sorted stack:
1 3 5 8
```

### Step 4: Generating Javadoc
To generate the Javadoc documentation for the project, use the following command:
```sh
javadoc -d docs Project5Main.java
```

This will create a `docs/` directory containing the generated HTML documentation. You can open `index.html` in a web browser to view the documentation.

## How to Access the Project
1. Clone the repository from GitHub:
    ```sh
    git clone https://github.com/ikeilo1/SortStack.git
    ```
2. Navigate to the project directory:
    ```sh
    cd SortStack
    ```

## Dependencies
- Java Development Kit (JDK): Required for compiling and running the Java program.
- Javadoc Utility: For generating documentation; part of the JDK.
- ManageStack Class: Handles all stack-related operations (assumed to be implemented in a separate file).
- UserInput Class: Facilitates user interaction and input handling (assumed to be implemented in a separate file).
- Open JDK version 17.0.13

## Contributing
Pull requests are welcome. For significant changes, please open an issue first to discuss what you would like to change.
