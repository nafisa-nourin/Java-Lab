//10-02-26 String processor reverse + vowel counting

class StringProcessor {

    // Recursive method to reverse a string
    static String reverseString(String str) {
        // Base case
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }

        // Recursive step
        return str.charAt(str.length() - 1)
                + reverseString(str.substring(0, str.length() - 1));
    }

    // Bonus: Recursive method to count vowels
    static int countVowels(String str) {
        if (str.length() == 0) {
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(0));
        int count = (ch == 'a' || ch == 'e' || ch == 'i' ||
                     ch == 'o' || ch == 'u') ? 1 : 0;

        return count + countVowels(str.substring(1));
    }

    public static void main(String[] args) {
        String s = "Hello";

        System.out.println("Reversed String: " + reverseString(s));
        System.out.println("Vowel Count: " + countVowels(s));
    }
}
