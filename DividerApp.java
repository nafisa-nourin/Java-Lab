//17-2-26
/*Write a Java program to perform division of two integers
 using try–catch–finally, where the program handles 
 ArithmeticException (division by zero) and prints a message in
  the `finally` block.
 */

  class DividerApp {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;   // Division by zero

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Please try again with a non-zero number.");
        }
        finally {
            System.out.println("Calculation Attempt Finished.");
        }
    }
}
