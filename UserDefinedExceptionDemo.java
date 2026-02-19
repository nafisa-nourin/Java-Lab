//17-02-26
/*Write a Java program to create and use a user-defined exception 
to check whether a person is eligible for voting. 
If the age is less than 18, throw an exception and 
handle it using a try–catch block. */


class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

class UserDefinedExceptionDemo {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age is not valid for voting");
        }
        else {
            System.out.println("Age is valid for voting");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
