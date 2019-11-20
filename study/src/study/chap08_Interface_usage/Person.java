package study.chap08_Interface_usage;

public class Person {
  //필드 , 생성자 ,메소드
	RemoteControl sb; // 필드로 인터페이스를 사용(변수처럼 사용 가능)
	String name;
	//생성자: 매개변수로 인터페이스를 사용
	public Person (String string){
		this.name = name;
	}
	// 메소드
	public void watchMovie() { // 메소드
		//로컬 변수로 인터페이스를 사용
		RemoteControl rc = new SettopBox();
		rc.turnOn(); // 셋탑박스 전원 on
		SettopBox s = (SettopBox)rc;
		s.showMovie("스타워즈");
		rc.turnOn(); // 셋탑박스 전원 on
	}
	public void method3(RemoteControl rc){
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
	}
}
