package com.bootcoding.method_hiding;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            // Your code that may throw an exception
            System.out.println("Inside try block");
            throw new Exception("Some exception occurred");
        } catch (Exception e) {
            // Handle the exception
            System.out.println("Caught an exception: " + e.getMessage());
//            System.exit(1);

        }
        finally {
            System.exit(1);
            // This block will be executed even if an exception occurs
            System.out.println("Inside finally block");
            // Uncomment the next line to prevent the finally block from executing
//             System.exit(1);
        }
    }
}
