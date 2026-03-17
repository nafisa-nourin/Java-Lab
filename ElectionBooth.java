/*17-03-26 Create a custom unchecked exception InvalidAgeException. 
Write a method to check voting eligibility and 
throw an exception if age < 18. */

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message) {
        super(message);
    }
}

class ElectionBooth {

    public static void checkEligibility(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Underage voters not allowed.");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(10);
            checkEligibility(20);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}