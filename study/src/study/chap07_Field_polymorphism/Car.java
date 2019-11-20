package study.chap07_Field_polymorphism;

public class Car {
	
	Tire frontLeftTire = new Tire("앞바퀴왼쪽", 6);
	Tire frontRightTire = new Tire("앞바퀴오른쪽", 2);
	Tire backLeftTire = new Tire("뒷바퀴왼쪽", 3);
	Tire backRightTire = new Tire("뒷바퀴오른쪽", 4);
	
	
	int run() {
		System.out.println("자동차가 출발합니다");
		if(frontLeftTire.roll()==false) { stop(); return 1; };
		if(frontRightTire.roll()==false) { stop(); return 2; };
		if(backLeftTire.roll()==false) { stop(); return 3; };
		if(backRightTire.roll()==false) { stop(); return 4; };
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 정지합니다");
	}
}

