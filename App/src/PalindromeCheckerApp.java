
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeChecker {

    // 1️⃣ Two-pointer algorithm
    public static boolean twoPointer(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // 2️⃣ Stack algorithm
    public static boolean stackAlgorithm(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) {
            if (stack.pop() != c) return false;
        }
        return true;
    }

    // 3️⃣ Deque algorithm
    public static boolean dequeAlgorithm(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char c : text.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        // Run and measure Two-Pointer
        long start = System.nanoTime();
        boolean tpResult = twoPointer(text);
        long end = System.nanoTime();
        long tpTime = end - start;

        // Run and measure Stack
        start = System.nanoTime();
        boolean stackResult = stackAlgorithm(text);
        end = System.nanoTime();
        long stackTime = end - start;

        // Run and measure Deque
        start = System.nanoTime();
        boolean dequeResult = dequeAlgorithm(text);
        end = System.nanoTime();
        long dequeTime = end - start;

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("--------------------------");
        System.out.println("Two-Pointer: " + tpResult + " | Time: " + tpTime + " ns");
        System.out.println("Stack      : " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque      : " + dequeResult + " | Time: " + dequeTime + " ns");
    }
}