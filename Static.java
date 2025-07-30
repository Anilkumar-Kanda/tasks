package java_tasks_exceptions;
// Task 2.2

interface RemoteControl1 {
	void turnOn();
	default void displayMode() {
		System.out.println("Battery is 90% charged.");
	}
	static void showCompany() {
		System.out.println("Company: Samsung");
	}
}
class Television1 implements RemoteControl1 {
	public void turnOn() {
		System.out.println("Television is now ON.");
	}	
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl1.showCompany();
		RemoteControl1 tv = new Television1();
		tv.turnOn();
		tv.displayMode();

	}

}
