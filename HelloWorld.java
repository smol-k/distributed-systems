public class HelloWorld {
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        if (args.length == 0) {
            System.err.println("Please add a parameter. For example start program with: java HelloWorld.java Kristina");
        } else {
            System.out.println("Hello, World! " + args[0]);
        }
    }
}
