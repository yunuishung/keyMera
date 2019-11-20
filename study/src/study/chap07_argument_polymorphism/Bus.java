package study.chap07_argument_polymorphism;

public class Bus extends Vehicle {
	@Override           
	public void run() {  // 부모의 메소드 run()을 재정의 
		                //어노테이션: 컴파일러에거 Override(재정의)를 알림
		System.out.println("버스가 달립니다");
	}
     
	
	
	
	           
	
}
