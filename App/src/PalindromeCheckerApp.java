

public class PalindromeChecker {



        public static void main(String[] args) {

            // Original string (hardcoded)
            String original = "racecar";

            // Variable to store reversed string
            String reversed = "";

            // Reverse using for loop
            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            // Compare using equals() method
            if (original.equals(reversed)) {
                System.out.println("\"" + original + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + original + "\" is NOT a Palindrome.");
            }
        }
    }