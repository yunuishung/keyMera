package study.chap06this_constructor;

public class Car {
  //필드
	String model;
	String color;
	int maxSpeed;
	
	
	public Car() { //디폴트 생성자
		
	}
	
	public Car(String model) {
		this(model, "White"); //아래의 3문장 대신에 다른 생성자를 호출 -> 생성자 2를 호출
 	//	this.model = model;
	//	this.color= "White";
	//	this.maxSpeed = 250;
	}
	// 생성자 2
	public Car(String model, String color) {
		this(model , color , 250);   //this : Car
	//	Car(model , color, 250);
	//	this.model = model;
	//	this.color= color;
	//	this.maxSpeed = 250;
	}
	//생성자 3
		public Car(String model, String color, int speed) {
			this.model = model; // this: Car(클래스)
			this.color= color;
			this.maxSpeed = speed;
		}
}
