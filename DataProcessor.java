/*17-3-26 write a method parseData(String) that converts a string to an integer 
using throws.Handle the exception in the main method.*/

class DataProcessor {

    // method with throws
    static int parseData(String input) throws NumberFormatException {
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {

        try {
            int result = parseData("ABC"); // invalid input
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}