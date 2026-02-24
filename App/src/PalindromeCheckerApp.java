

public class PalindromeChecker {



        public static void main(String[] args) {

            String text = "A man a plan a canal Panama";

            // Step 1: Normalize string
            String normalized = text.replaceAll("\\s+", "")   // Remove spaces
                    .toLowerCase();           // Convert to lowercase

            // Step 2: Apply two-pointer logic
            int left = 0;
            int right = normalized.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (normalized.charAt(left) != normalized.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            // Step 3: Print result
            if (isPalindrome) {
                System.out.println("\"" + text + "\" is a Palindrome (ignoring case & spaces).");
            } else {
                System.out.println("\"" + text + "\" is NOT a Palindrome.");
            }
        }
    }