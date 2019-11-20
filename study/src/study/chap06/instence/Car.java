package study.chap06.instence;

public class Car {
      //필드
	int speed;
	String model;
	String color;
	
	//정적 필드: 공용데이터 -> 클래스 Car에 공통으로 사용되는 데이터  -> 하나만 존재
	public static int MaxSeatNum; // 정적 필드에서는 static을  붙여준다
	
	  //생성자
	public Car() { }
	
	  //메소드 
	public void setSpeed(int s) {
		speed = s;
		
	}
	public int  getSpeed() {
		return speed;
	}
	// 정적 메소드: 객체의 생성 없이 존재한다.
	//접근 방법: 클래스 이름. 메소드 이름(Car.changeBattery)
	 public static void changeBattery( ) {
		 System.out.println("배터리를 교환합니다");
	 }
}
