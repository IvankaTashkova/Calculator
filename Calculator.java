package Calculator;

public class Calculator {

	public static String calculate(int a, int b, String operation) {
		switch (operation) {
		case "+":
			return ""+add(a, b);
		case "-":
			return ""+substract(a, b);
		case "x":
			return ""+multiply(a, b);
		case "/":
			return ""+devide(a, b);
		}
		return "";
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int substract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int devide(int a, int b) {
		return a / b;
	}

}
