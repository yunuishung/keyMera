package study.chap08_anonymous;

public class MainExample {

	public static void main(String[] args) {
		 // 텔레비전 구현 객체를 사용 -> 객체의 이름이 없음
	//	RemoteControl r = new Television();
		// 익명 객체는 클래스 이름이 없음
		//클래스 이름이 없으므로 생성자를 인터페이스 이름으로 사용한다
		RemoteControl rc = new RemoteControl() { 
		    //구현 객체:RemoteControl을 implements(구현)
			//추상 메소드를 재정의 하여야 한다
			// 클래스 블럭이다.: 필드 , 디폴트 생성자만 존재 ,메소드
			int field1 = 20;
			
			
			void  method1() {
				turnOn();
			
			}
			// 구현 객체이므로 추상메소드를 재정의한다.
			@Override
			public void turnOn() {
			System.out.println("텔레비전을 켭니다");
				
			}
			@Override
			public void turnOff() {
			System.out.println("텔레비전을 끕니다");
				
			}
			@Override
			public void setVolume(int volume) {
			System.out.println("볼륨을" + volume + "으로 설정");
				
			}
	};
      rc.turnOn();
      rc.setVolume(20);
      rc.turnOff();
      //rc.field(); // 사용 불가 (구현 객체 내에서만 사용된다)
      //rc.method(); // 사용 불가(구현 객체 내에서만 사용)
      //클래스 이름이 없으므로 강제 타입변환을 할 수 없음 
      
      RemoteControl audio = new RemoteControl() {
    	  @Override
    	public void turnOn() {
    		System.out.println("오디오를 켭니다");
    		
    	}
    	  @Override
    	public void turnOff() {
    		System.out.println("오디오를 끕니다");
    		
    	}
    	  @Override
    	public void setVolume(int volume) {
    		System.out.println("오디오 볼륨을 "+ volume + " 합니다 ");
    		
    	}
      };
       audio.turnOn();   // 메소드를 실행하려면 호출 해주어야 함
       audio.setVolume(30);
       audio.turnOff();
       
}
}
