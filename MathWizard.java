//17-02-26 recursive factorial

class MathWizard {

    static int factorial(int n) {
        if (n == 0 || n == 1)  
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        
        try {
            System.out.println("Factorial of 5 = " + factorial(5));
            System.out.println("Factorial = " + factorial(-1));

        } catch (StackOverflowError e) {

            System.out.println("Error: Stack Overflow Error occurred");
        }
    }
}
