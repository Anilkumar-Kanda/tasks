package java_oops_tasks;
// task5

class BaseVehicle {
	String brand;
	int speed;
	BaseVehicle(String brand, int speed){
		this.brand = brand;
		this.speed = speed;
	}
	void showDetails()
	{
		System.out.println("Brand: " + brand);
		System.out.println("Speed: " + speed + "km/h");
	}
}
class Car extends BaseVehicle{
	Car(String brand, int speed){
		super(brand, speed);
	}
	
	void showDetails()
	{
		System.out.println("Car brand: " + brand);
		System.out.println("Car speed: " + speed + "km/h");
	}
}

class Bike extends BaseVehicle {
	Bike(String brand, int speed){
		super(brand, speed);
	}
	
	void showDetails() {
		System.out.println("Bike brand: " + brand);
		System.out.println("Bike Speed: " + speed + "km/h");
	}
}
public class Vehicle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Car myCar = new Car("Rang Rover", 150);
	Bike myBike = new Bike("Royal Enfiled", 110);
	myCar.showDetails();
	System.out.println();
	myBike.showDetails();

	}

}
