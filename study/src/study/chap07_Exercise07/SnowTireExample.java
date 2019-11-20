package study.chap07_Exercise07;

public class SnowTireExample {


	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;   //자동타입 변환
        snowTire.run(); // 자식이 재정의한 메소드가 호출됨
        tire.run();  // 부모 타입으로 run()을 호출하면 부모의 메소드 run()이 
                     // 실행되지 않고  자식이 재정의한 run()이 호출됨
	}

}
