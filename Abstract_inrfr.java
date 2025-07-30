package java_oops_tasks;
//Task-8

abstract class Appliance{
	abstract void turnOn();
}
interface Connectable{
	void connect();
}
class SmartTV extends Appliance implements Connectable{
	void turnOn() {
		System.out.println("SmartTv is now ON.");
	}
	public void connect() {
		System.out.println("SmartTV connected to wi-fi.");
	}
}

public class Abstract_inrfr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTV tv = new SmartTV();
		tv.turnOn();
		tv.connect();

	}

}
