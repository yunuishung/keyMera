package study.chap06.static_block;

public class Car {
	
		//정적 필드
		public static int field1= 20; // 변수 선언과 함께 초기화
		static int field2;  // 초기화 하지 않음
		
		// 인스턴스 필드 : 객체 생성 후 메모리에 저장 공간이 할당된 다음에 사용되는 필드
		
		int seatNum;
		int TireNum;
		int speed;
			
		
		// 정적 메소드
		static void method() { // 정적 블럭 ( "{" 로 시작해서  "}"로 끝나는 부분
			     //static { } : 정적 블럭
			field1 = 30;
		// this.field2 = 30;  //this : Car(특정 인스턴스: 객체 생성 후) -> 사용 불가
		//    seatNum = 4; // 사용 불가 -> 객체 생성 후	
		//	setSpeed(5); // 인스턴스 메소드 호출 불가
			method2(); // 정적 메소드 호출 가능
		}
		
		{
		  TireNum = 4;
		}
		
		
		//인스턴스 메소드
		public void setSpeed(int speed) {
			this.speed = speed;  // 인스턴스 필드 (this : Car) 객체가 생성된 다음
		}
		static void method2() {
			System.out.println("정적 메소드2가 불림");
		}
        
}
