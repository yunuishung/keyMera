package study.chap06.method;

public class CarExample {

	public static void main(String[] args) {
		 Car car1= new Car();
		 car1.gas(40);
		 for(int i = 0; i < 20; i++) {
			 car1.drive();
		 }

	}

}
