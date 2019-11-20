package study.chap08_abstract_class;

public abstract class Aclass { // abstract : 추상 클래스 -> 공통사항
 // 미완성된 클래스 -> 객체화 불가능
 // 추상클래스를 상속을 받아 새로운 클래스 정의해서 사용
 // 멤버: 필드 , 생성자 , 메소드
 // 인스턴스 메소드
	public void method1() {
		System.out.println("method1()이 호출됨");
	}
	 //추상 메소드: abstract 키워드를 사용
	public abstract void method2(); { // 선언부만 존재 , 반환형 , 메소드이름 ,매개변수
		
	}
}
