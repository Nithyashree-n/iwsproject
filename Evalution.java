package test.iws;
import java.util.Scanner;
public class Evalution extend calculator {
	public static int evaluate(String expression) {

		String operands[] = expression.split("[\\+\\-\\*\\/]");
		String operators[] = expression.split("\\d+");
		int result = 0;

		for (int index = 0; index < operators.length; index++) {
		int currentValue = Integer.parseInt(operands[index]);
		if (operators[index].equals("+"))
		result = result + currentValue;
		else if (operators[index].equals("-"))
		result = result - currentValue;
		else if (operators[index].equals("*"))
		result = result * currentValue;
		else if (operators[index].equals("/"))
		result = result / currentValue;
		else
		result = result + currentValue;
		}
		return result;
		}

		void getResult() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input your Expression");
		String expression = input.next();
		int result = evaluate(expression);
		System.out.println("Value of the expression is " + result);
		System.out.println("========================================");

		}

		}

