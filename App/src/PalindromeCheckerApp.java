

public class PalindromeChecker {

        public static void main(String[] args) {

            // Hardcoded string
            String text = "madam";

            // Check if palindrome
            boolean isPalindrome = true;

            int left = 0;
            int right = text.length() - 1;

            while (left < right) {
                if (text.charAt(left) != text.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            // Print result
            if (isPalindrome) {
                System.out.println("\"" + text + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + text + "\" is NOT a Palindrome.");
            }
        }
    }
