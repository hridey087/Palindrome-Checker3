

public class PalindromeChecker {




        public static void main(String[] args) {

            String text = "madam";

            boolean isPalindrome = checkPalindrome(text, 0, text.length() - 1);

            if (isPalindrome) {
                System.out.println("\"" + text + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + text + "\" is NOT a Palindrome.");
            }
        }

        // Recursive method
        public static boolean checkPalindrome(String str, int left, int right) {

            // Base condition
            if (left >= right) {
                return true;
            }

            // If mismatch found
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            // Recursive call (check inner substring)
            return checkPalindrome(str, left + 1, right - 1);
        }
    }