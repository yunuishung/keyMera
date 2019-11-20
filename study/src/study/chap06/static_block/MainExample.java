package study.chap06.static_block;

public class MainExample {

	public static void main(String[] args) {
		 //정적 멤버: 공용 데이터
		Car.field1 = 20;
		Car.method();
		
		// 인스턴스 멤버: 개별 데이터
		Car car1 = new Car();
		car1.seatNum = 4;
		car1.setSpeed(60);

	}

}
