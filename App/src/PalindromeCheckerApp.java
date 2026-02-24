import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {



        public static void main(String[] args) {

            // Hardcoded string
            String text = "refer";

            // Create Deque
            Deque<Character> deque = new LinkedList<>();

            // Insert characters into deque
            for (int i = 0; i < text.length(); i++) {
                deque.addLast(text.charAt(i));   // Insert at rear
            }

            boolean isPalindrome = true;

            // Compare front and rear
            while (deque.size() > 1) {
                char front = deque.removeFirst();  // Remove from front
                char rear = deque.removeLast();    // Remove from rear

                if (front != rear) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            if (isPalindrome) {
                System.out.println("\"" + text + "\" is a Palindrome.");
            } else {
                System.out.println("\"" + text + "\" is NOT a Palindrome.");
            }
        }
    }