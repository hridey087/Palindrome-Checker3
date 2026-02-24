
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;




    // 1️⃣ Strategy Interface
    interface PalindromeStrategy {
        boolean check(String text);
    }

    // 2️⃣ Stack-based Strategy
    class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean check(String text) {
            if (text == null) return false;
            text = text.replaceAll("\\s+", "").toLowerCase();
            Stack<Character> stack = new Stack<>();
            for (char c : text.toCharArray()) stack.push(c);
            for (char c : text.toCharArray()) {
                if (stack.pop() != c) return false;
            }
            return true;
        }
    }

    // 3️⃣ Deque-based Strategy
    class DequeStrategy implements PalindromeStrategy {
        @Override
        public boolean check(String text) {
            if (text == null) return false;
            text = text.replaceAll("\\s+", "").toLowerCase();
            Deque<Character> deque = new LinkedList<>();
            for (char c : text.toCharArray()) deque.addLast(c);
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) return false;
            }
            return true;
        }
    }

    // 4️⃣ Two-pointer Strategy
    class TwoPointerStrategy implements PalindromeStrategy {
        @Override
        public boolean check(String text) {
            if (text == null) return false;
            text = text.replaceAll("\\s+", "").toLowerCase();
            int left = 0, right = text.length() - 1;
            while (left < right) {
                if (text.charAt(left) != text.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }
    }

    // 5️⃣ Context class
    class PalindromeCheckerContext {
        private PalindromeStrategy strategy;

        public PalindromeCheckerContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public void setStrategy(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean check(String text) {
            return strategy.check(text);
        }
    }

    // 6️⃣ Client / Main Application
    public class PalindromeChecker {
        public static void main(String[] args) {

            String text = "A man a plan a canal Panama";

            // Use Stack Strategy
            PalindromeCheckerContext context = new PalindromeCheckerContext(new StackStrategy());
            System.out.println("Stack Strategy: " + (context.check(text) ? "Palindrome" : "Not Palindrome"));

            // Switch to Deque Strategy at runtime
            context.setStrategy(new DequeStrategy());
            System.out.println("Deque Strategy: " + (context.check(text) ? "Palindrome" : "Not Palindrome"));

            // Switch to Two-Pointer Strategy
            context.setStrategy(new TwoPointerStrategy());
            System.out.println("Two-Pointer Strategy: " + (context.check(text) ? "Palindrome" : "Not Palindrome"));
        }
    }