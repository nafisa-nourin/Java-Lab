//17-02-26 division by zero

class Calculator {

    static void divide(int a, int b) {

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
        catch (Exception e) {
            System.out.println("Error: General exception.");
        }
    }

    public static void main(String[] args) {

        divide(10, 2);   // Normal case
        divide(10, 0);   // Division by zero
    }
}


