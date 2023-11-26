public class SimpleProgram {
    // Constructor
    public SimpleProgram() {
        // Constructor logic (if needed)
    }

    // Non-static method
    public void nonStaticMethod() {
        // Non-static method logic
        System.out.println("This is a non-static method.");
    }

    // Static method 1
    public static void staticMethod1() {
        // Static method logic
        System.out.println("This is static method 1.");
    }

    // Static method 2
    public static void staticMethod2() {
        // Static method logic
        System.out.println("This is static method 2.");
    }

    public static void main(String[] args) {
        // Create an instance of the class (calls the constructor)
        SimpleProgram program = new SimpleProgram();

        // Call the non-static method
        program.nonStaticMethod();

        // Call the static methods
        staticMethod1();
        staticMethod2();
    }
}