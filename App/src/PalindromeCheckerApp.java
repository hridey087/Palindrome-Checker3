

public class PalindromeChecker {



        // Public method to check palindrome
        public boolean checkPalindrome(String input) {
            if (input == null) return false;

            // Normalize input: remove spaces and convert to lowercase
            String normalized = input.replaceAll("\\s+", "").toLowerCase();

            // Two-pointer palindrome check
            int left = 0;
            int right = normalized.length() - 1;
            while (left < right) {
                if (normalized.charAt(left) != normalized.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        // Main method to test the checker
        public static void main(String[] args) {
            PalindromeChecker checker = new PalindromeChecker();

            String[] testStrings = {
                    "Madam",
                    "A man a plan a canal Panama",
                    "Hello",
                    "Racecar",
                    "No lemon no melon"
            };

            for (String text : testStrings) {
                if (checker.checkPalindrome(text)) {
                    System.out.println("\"" + text + "\" is a Palindrome.");
                } else {
                    System.out.println("\"" + text + "\" is NOT a Palindrome.");
                }
            }
        }
    }