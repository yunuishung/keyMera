package study.chap06.import_package;

import study.chap06.access_modifier.Car;

public class MainExample {

	public static void main(String[] args) {
	  Car car = new Car();
	  Car car2 = new Car("현대");
	  Car car3 = new Car(10.5);
	  Car Car4 = new Car(10);
	  car.field1 = 20;
	  car.field2 = 20;
	  car.field3 = 20;
	  car.field4 = 20;
	  
	  car.method1();
	  car.method2();
	  car.method3();
	  car.method4();
}

	
}