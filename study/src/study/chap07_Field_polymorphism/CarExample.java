package study.chap07_Field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		 // 자동차를 생성 - > 일정한 횟수를 운행 -> 타이어 수명이 다해서 펑크
		// 자동차를 stop -> 타이어를 교체 -> 계속 운행
		Car car = new Car();
		for(int i = 0; i < 5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1: // 앞왼쪽 바퀴 펑크
				System.out.println("앞왼쪽 Hankook Tire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽 ", 15);
				break;
			case 2: // 앞 오른쪽 바퀴 펑크 -> 교체
				System.out.println("앞오른쪽 kumho Tire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽 ", 15);
				break;
			case 3: // 앞 오른쪽 바퀴 펑크 -> 교체
				System.out.println("뒤 왼쪽  Hankook Tire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽 ", 15);
				break;
			case 4: // 앞 오른쪽 바퀴 펑크 -> 교체
				System.out.println("뒤오른쪽 kumho Tire로 교체");
				car.frontRightTire = new HankookTire("앞오른쪽 ", 15);
				break;
			}
			  System.out.println();
		}

	}

}
