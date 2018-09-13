package com.iluwatar.interpreter;

import java.util.Stack;

import com.iluwatar.interpreter.expression.AbsExpression;
import com.iluwatar.interpreter.expression.MinusExpression;
import com.iluwatar.interpreter.expression.MultiplyExpression;
import com.iluwatar.interpreter.expression.NumberExpression;
import com.iluwatar.interpreter.expression.PlusExpression;

/**
 * 
 * Interpreter pattern breaks sentences into expressions (Expression) that can
 * be evaluated and as a whole form the result.
 * 
 */
public class App {

	/**
	 * 
	 * Expressions can be evaluated using prefix, infix or postfix notations
	 * This sample uses postfix, where operator comes after the operands
	 * 
	 */
	public static void main(String[] args) {
		String tokenString = "4 3 2 - 1 + *";
		Stack<AbsExpression> stack = new Stack<>();

		String[] tokenList = tokenString.split(" ");
		for (String s : tokenList) {
			if (isOperator(s)) {
				AbsExpression rightExpression = stack.pop();
				AbsExpression leftExpression = stack.pop();
				System.out.println(String.format("popped from stack left: %d right: %d", leftExpression.interpret(),
						rightExpression.interpret()));
				AbsExpression operator = getOperatorInstance(s, leftExpression, rightExpression);
				System.out.println(String.format("operator: %s", operator));
				int result = operator.interpret();
				NumberExpression resultExpression = new NumberExpression(result);
				stack.push(resultExpression);
				System.out.println(String.format("push result to stack: %d", resultExpression.interpret()));
			} else {
				AbsExpression i = new NumberExpression(s);
				stack.push(i);
				System.out.println(String.format("push to stack: %d", i.interpret()));
			}
		}
		System.out.println(String.format("result: %d", stack.pop().interpret()));
	}

	public static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*");
	}

	public static AbsExpression getOperatorInstance(String s, AbsExpression left, AbsExpression right) {
		switch (s) {
		case "+":
			return new PlusExpression(left, right);
		case "-":
			return new MinusExpression(left, right);
		case "*":
			return new MultiplyExpression(left, right);
		}
		return null;
	}
}
