package study.chap06.review;


public class MainExample {

	public static void main(String[] args) {
		 // 자동차 실체: 가상현실
		Car myCar = new Car(""); // 자동차 생성 -> 힙 영역에 메모리를 생성됨 
		//필요에 의하여 생성자 선택
		System.out.println("속도: " + myCar.speed);
		myCar.company = "기아"; // 참조 변수.필드
		myCar.speedUp(60);
		Car caw2 = new Car("현대");
		Car car3 = new Car("BMW","520");
		System.out.println("속도 "+ myCar.speed);
		
	
		

	}

}
