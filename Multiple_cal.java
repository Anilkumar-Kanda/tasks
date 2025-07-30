package java_oops_tasks;
// task6
class Calculator
{
	int add(int a , int b) {
		return a + b;
	}
		double add(double a, double b) {
			return a + b;
		}
		String add(String a, String b) {
		return a + b;
		}
}

public class Multiple_cal {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("Int Add: " + c.add(50,60));
		System.out.println("Double Add: " + c.add(4.2, 6.4));
		System.out.println("String Add: " + c.add("Java", "Programming"));
	}

}
