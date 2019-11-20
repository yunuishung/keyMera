package study.chap08_Interface_usage;

public class TodaySchdule {
     //변수
	 int  num; // int -> 인터페이스
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		p1.sb = new Television();
		p1.sb.turnOn();   // 추상 메소드를 재정의한 메소드
		p1.sb.turnOff(); //default 메소드
		p1.sb = new SettopBox();
		p1.sb.turnOn();
		p1.sb.turnOff();
		p1.method3((new Television()));
		p1.watchMovie();
		RemoteControl.changeBattery(); // 정적 메소드		
		

	}

		
	}


