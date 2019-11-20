package study.chap07_abstract;

public class MainExample {

	private static Phone sp;

	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동"); // 인스턴스화가 불가능 하다
		 Phone phone2 = new Smartphone("홍길동"); 
		 Phone2.= new NotePhone("홍길동");
		 phone2.turnOn();
		 phone2.turnOff();
		 Smartphone.sp = (Smartphone)phone2;
		 sp.turnOn();
		 sp.internetSearch("http// www.naver.com");
		 sp.turnOff();
		 

	}

}
