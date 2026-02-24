

public class PalindromeChecker {




        public static void main(String[] args) {

            // Hardcoded string
            String text = "level";

            // Convert String to character array
            char[] characters = text.toCharArray();

            // Two-pointer approach
            int left = 0;
            int right = characters.length - 1;

            boolean isPalindrome = true;

            while (left < right) {
                if (characters[left] != characters[right]) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            // Display result
            if (isPalindrome) {
                System.out.println("\"" + text + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + text + "\" is NOT a Palindrome.");
            }
        }
    }