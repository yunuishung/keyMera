package study.chap08_Interface_Definition;

public class MainExample {

	public static void main(String[] args) {
		Television tv = new Television();
		//tv.MAX_VOLUME = 5; // 상수이므로 변경 불가능
	    tv.turnOn();
	    tv.setVolume(10);
	    tv.setMute(true);
	    tv.setMute(false);
	    RemoteControl.changeBattery(); // 정적 메소드
	    //클래스: 자동 타입 변환 부모클래스 타입  = 자식 클래스 객체
	    //인터페이스 : 자동 타입 변환(인터페이스 = 구현클래스 객체)
	   RemoteControl rc = new Television();
	   rc.setMute(true);
	   rc.setVolume(20);
//	   rc.setChannel(07); // 불가능(Television 클래스에서 정의한 메소드)
//	   rc.channel(08); // (클래스에서 정의한 메소드)
	   // 내가 볼 수있는 것은 인터페이스에서 정의한 것만
	   //강제 타입 변환 : 원래 생성된 객체가 Television이므로 가능
	   Television t = (Television) rc;
	   t.channel = 9;
	   t.changeChannel(14); // 클래스에서 만든 것
	   t.setVolume(5); // 인터페이스 추상메소드를 재정의
	   if(rc instanceof Aircon) {
		Television t2 = (Television)rc;   
	   }
	   }else   
	    Aircon a = (Aircon)rc; // 가능한 것처럼 보이지만
	             // ClassCasteException 예외가 발생함 (원래 Television)

	}  

}
       

