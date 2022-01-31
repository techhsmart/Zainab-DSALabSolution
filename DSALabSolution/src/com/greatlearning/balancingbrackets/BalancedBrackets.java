package com.greatlearning.balancingbrackets;

import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {
	private static boolean isBalanced(String bracketExpression) {
		Stack<Character> stack = new Stack();

		for (char c : bracketExpression.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') {
				// push to stack
				stack.push(c);
			} else {

				if (stack.isEmpty()) {
					return false;
				}

				// pop from the stack (d)
				Character d = (Character) stack.pop();
				// check if c is the closing bracket for d
				if (c == '}' && d != '{' || (c == ')' && d != '(') || (c == ']' && d != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brackets");
		String bracketExpression = sc.nextLine();

		if (isBalanced(bracketExpression)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}