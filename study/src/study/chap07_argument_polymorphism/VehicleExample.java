package study.chap07_argument_polymorphism;

public class VehicleExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Bus();   // 자동 타입변환
		Bus bus = (Bus) vehicle;       // 강제 타입변환
	//	bus.  /// 부모 Vehicle(필드 , 메소드), 자식 Bus(필드, 메소드)
		driver.drive(new Bus());   // 배차를 버스 -> 운전
		driver.drive(new Taxi());  // 택시를 운전
		
		// 매개변수에 어떤 자식 객체를 넣어주냐에 따라 자식객체의 
		// run()이 호출된다
		double d = 1.24;
		int num =(int)d;
	}

}
