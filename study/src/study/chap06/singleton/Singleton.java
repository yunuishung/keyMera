package study.chap06.singleton;
/*
 * 싱글톤(Singleton): 객체가 하나만 존재
 * 어떤 데이터를 한군데서만 관리한다.
 * 객체를 여러개 만들면 데이터의 불일치 -> 객체를 하나만 유지하고 싶다
 */



public class Singleton {
	//1. 정적 필드 instance
	private static Singleton instence = new Singleton(); // private : 자신의 클래스에서만 접근 가능
	
	//2. private 생성자 정의
	 private Singleton() { } // 생성자
	 
	 //3. 객체에 접근할 수 있는 주소를 얻을 수 있는 메소드를 제공
     
	 public static Singleton getInstence() {
		 System.out.println("내가 호출됨");
		 return instence;
	 }
	  static int data[] = new int [10];
}
