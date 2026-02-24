

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class PalindromeChecker {




        public static void main(String[] args) {

            // Hardcoded string
            String text = "madam";

            // Create Queue and Stack
            Queue<Character> queue = new LinkedList<>();
            Stack<Character> stack = new Stack<>();

            // Enqueue and Push characters
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                queue.add(ch);     // Enqueue (FIFO)
                stack.push(ch);    // Push (LIFO)
            }

            boolean isPalindrome = true;

            // Compare dequeue and pop
            while (!queue.isEmpty()) {
                if (queue.remove() != stack.pop()) {
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
}