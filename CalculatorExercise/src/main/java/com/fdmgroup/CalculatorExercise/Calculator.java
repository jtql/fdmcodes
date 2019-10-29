package com.fdmgroup.CalculatorExercise;

public class Calculator {
	public double evaluate(String expression) {

		double result = 0.0;

		if (expression.matches("\\d+[.]\\d+||\\d+||\\-\\d+")) {
			result = Double.parseDouble(expression);
		} else {
			if (expression.contains("(")) {
				int closeBracket = expression.indexOf(')');
				String tempString = expression.substring(0, closeBracket);
				int openBracket = tempString.lastIndexOf('(');
				if (openBracket == 0) {
					String inBracket = expression.substring(openBracket + 1, closeBracket);
					String rhs = expression.substring(closeBracket + 1);
					String newString = Double.toString(evaluate(inBracket)) + rhs;
					result = evaluate(newString);
				} else if (closeBracket == expression.length() - 1) {
					String lhs = expression.substring(0, openBracket);
					String inBracket = expression.substring(openBracket + 1, closeBracket);
					String newString = lhs + Double.toString(evaluate(inBracket));
					result = evaluate(newString);
				} else {
					String lhs = expression.substring(0, openBracket);
					String inBracket = expression.substring(openBracket + 1, closeBracket);
					String rhs = expression.substring(closeBracket + 1);
					String newString = lhs + Double.toString(evaluate(inBracket)) + rhs;
					result = evaluate(newString);
				}
			} else if (expression.contains("+")) {
				String lhs = expression.substring(0, expression.lastIndexOf('+'));
				String rhs = expression.substring(expression.lastIndexOf('+') + 1);
				result = evaluate(lhs) + evaluate(rhs);
			} else if (expression.matches(".*\\d+\\-\\-\\d+.*")) {
				String lhs = expression.substring(0, expression.lastIndexOf("--"));
				String rhs = expression.substring(expression.lastIndexOf("--") + 1);
				result = evaluate(lhs) - evaluate(rhs);
			} else if (expression.matches(".*\\d+\\-\\d+.*")) {
				int minusIndex = expression.lastIndexOf('-');
				while (!isMinus(expression, minusIndex)) {
					minusIndex = expression.substring(0, minusIndex).lastIndexOf('-');
				}
				String lhs = expression.substring(0, minusIndex);
				String rhs = expression.substring(minusIndex + 1);
				result = evaluate(lhs) - evaluate(rhs);
			} else if (expression.contains("*")) {
				String lhs = expression.substring(0, expression.lastIndexOf('*'));
				String rhs = expression.substring(expression.lastIndexOf('*') + 1);
				result = evaluate(lhs) * evaluate(rhs);
			} else if (expression.contains("/")) {
				String lhs = expression.substring(0, expression.lastIndexOf('/'));
				String rhs = expression.substring(expression.lastIndexOf('/') + 1);
				result = evaluate(lhs) / evaluate(rhs);
			}

		}

		return result;
	}

	private static boolean isMinus(String expression, int index) {
		if (Character.toString(expression.charAt(index - 1)).matches("\\d")) {
			return true;
		} else {
			return false;
		}
	}

}
