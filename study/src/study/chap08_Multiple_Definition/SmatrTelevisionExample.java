package study.chap08_Multiple_Definition;

public class SmatrTelevisionExample {

	private static Seacherble Seacherble;

	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		RemoteControl rc =   new SmartTelevision();
		rc.turnOn();
		rc.setVolume(10);
		//rc.search();  // 에러 : 불가능 (RemotrControl 타입)
		Seacherble = (Seacherble)rc; // 원래 생성한 것이 SmartTelevision
		s.search("http://www.naver.com");
		rc.turnOff();
		
		

	}

}
