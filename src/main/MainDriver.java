package main;

// Note the class name (MainDriver) matches exactly to the file name
// public is access modifier keyword that allows access anywhere in the project structure
// class keyword is to denote the generation of a class
public class MainDriver {

    // Below is known as the main signature.
    // static - means that the method is loaded on class initialization
    // void - is the keyword that means it is not returning any value

    // When you click the green hammer above it builds the project (***compiling ***)
    // When you click the green play button tot he left, it compiles & executes the java code
    // NEED class to run any java program, note that Java is primarily an OOP language. Java 8 that functional programming was introduced
    public static void main(String[] args) {
        System.out.println("Hello World"); // System.out.println(); (shortcute - type sout) this is how you print to terminal

        // Operators (Arithemetic, Conditional, Logical, Comparison)

        System.out.println("------Arithmetic Operators-----");
        // Datatypes - String, int, boolean, float, double, short, long, char, byte (-128 to 127)
        int x = 10; // Declaring the variable x and assigning the value of 10, you must specify the datatype when declaring
        x = 2; // Re-assigning x
        // x = "Hello"; re-assignment won't work bc it's declared as an int datatype not a string
        int y = 10;

        System.out.println("Addition"); // ctrl + d is the shortcut to paste a duplicate line below (or if you highlight, it will duplicate the highlighted code)
        System.out.println(x + y);

        System.out.println("Subtraction");
        System.out.println(x - y);

        System.out.println("Multiplication");
        System.out.println(x * y);

        // Printing the console example, with print, println and printf
        // print - just prints to the console with no additional features or a new line
        // println - just prints to the console with a new line at the end
        // printf - print formatter, that lets you assign variables in a string using % to be filled later in the method, doesn't include a new line)
        System.out.println("Division");
        System.out.print(y + " / " + x + " = " + y / x + "\n"); // String concatenation, more concatenations = more stress ont he system
//        System.out.println(y / x);

        System.out.printf("%d / %d = %d\n", y, x, y / x); // print format, %d = digit

        System.out.println();
        System.out.println("------Static Method showcase------");
        addition(x, y);

    }

    // private keyword means only in the class itself can this be used
    private static void addition(int x, int y){ // void return means no value is given back, used for anything you want to print to console
        System.out.printf("%d + %d = %d", y, x, y / x);
    }

}
