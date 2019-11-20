package study.chap06constructor;

public class CarExample {
	 //필드
     
     //생성자를 정의하지 않았음 -> default 생성자가 존재한다
	int speed;
	public static void main(String[] args) {
		Car myCar = new car(); // 객체 생성(디폴트 생성자를 사용)
		System.out.println("속도: " + myCar.speed);
		  //speed = 0;
		
		//객체를 생성하면서 speed 값을 설정하고 싶다
		Car car1 = new Car(300);
		System.out.println("car1속도: " + car1.speed);
		
		Car car2 = new Car(400, 4);
		System.out.println("car2속도: " + car2.speed);
		System.out.println("car2좌석수: " + car2.seat);
		
		
	}
}
