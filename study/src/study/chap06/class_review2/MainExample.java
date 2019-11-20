package study.chap06.class_review2;

public class MainExample {
    // 프로그램이 실행 되려면  main() 메소드가 있는 클래스가 필요
	//main() 메소드의 시작부터 끝까지 수행이 된다. : 프로그램의 시작과 종료
	public static void main(String[] args) {
		Phone  phone = new Phone("갤8",30000);
		phone.powerOn();
		phone.sendMessage("안녕하세요 반갑습니다");
		phone.hookOff();
		//...
		phone.hookOn();
		phone.receiverMessage();
		phone.powerOff();

	}

}
