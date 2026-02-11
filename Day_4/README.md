# JAVA METHODS

syntax : access_modifier rerturn_type method_name(parameters){ block of code }

## Method uses:
  - code reusability
  - maintainability
  - readability

## TYPES OF METHOD IN JAVA:

### 1. By who create the method
        a. Predifined method
        b. Userdefined method

### 2. By how the method is called
        a. Static method
        b. Non static method (reference)

### 3. By what they do 
        a. Accessor(get)
        b.Mutator(set)

## TYPES OF ACCESS MOIFIER IN JAVA:

1.public – The member is accessible from anywhere
2.private – The member is accessible only within the same class
3.protected – The member is accessible within the same package and by subclasses
4.default (no modifier) – The member is accessible only within the same package

## COMMAND LINE ARGUMENTS IN JAVA:

### What are Command Line Arguments?

- They are inputs given to a Java program when  run it from the command line
- It is used to pass data to program without changing the code
- In Java,command line arguments are stored in the String[] args array of the main method

### Example:

public class CommandLineExample {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}

### Run this program from command line:

java CommandLineExample Hello 123 Java

### Output:

Number of arguments: 3
Argument 0: Hello
Argument 1: 123
Argument 2: Java

### Calling of main() method:

- The main() method in Java is called by the JVM automatically; it is the entry point of any Java program.
- The parameters of the main() method are only of String[] type (String[] args). No other data type is allowed.

### Workflow:

> OS runs JVM – The operating system starts the Java Virtual Machine
> JVM reads the command from the command prompt (like java ProgramName arg1 arg2)
> JVM creates an array: String[] args to store command line arguments
> JVM calls main() method
> JVM fills the args array with the values you passed on the command line
