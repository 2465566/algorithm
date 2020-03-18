package algorithm.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class SentenceReverse {

    public static void main(String[] agrs) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(getResult(input));
    }

    public static String getResult(String input) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String[] arr = input.split("\\s");
        for (String str : arr) {
            stack.push(str);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }
        return sb.toString();
    }
}
