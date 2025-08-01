package java_oops_tasks;
// task-11
@FunctionalInterface
interface MathOperation{
	int operate(int a, int b);
}

public class Lamda_math_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a, b) -> a + b;
		MathOperation subtract = (a, b) -> a - b;
		MathOperation multiply = (a, b) -> a * b;
		
		System.out.println("Addition: " + add.operate(10, 40));
		System.out.println("Subtraction: " + subtract.operate(15, 7));
		System.out.println("Multiplication: " + multiply.operate(25, 5));

	}

}
