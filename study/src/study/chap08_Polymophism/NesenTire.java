package study.chap08_Polymophism;

public class NesenTire implements Tire{

	String location;
	int maxRotation;
	int accumulateRotation;
	
	//생성자
	public NesenTire(String location , int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//Tire 인터페이스의 메소드를 재정의
	//바퀴가 굴러가는 동작 : 수명 , 누적회전수 ,펑크 ,위치를 반환
	@Override
	public boolean roll() {
		accumulateRotation++; // 바퀴가 회전
		if(accumulateRotation < maxRotation) {
			System.out.println(location + "HanKookTire 남은 수명: " +
		   (maxRotation - accumulateRotation));
	
		return true;
	} else {
			System.out.println("***" + location + "NesenTire");
			return false;
	
	}
	
		}

	

}
