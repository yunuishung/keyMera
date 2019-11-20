package study.chap08_abstract_class;

public class InterfaceAimpi implements InterfaceA {
	 // 클래스 : 필드, 생성자, 다른 메소드
	int field1;
	public InterfaceAimpi(int field1) {
		this.field1 = field1;
	}
     // 상수 ,default 메소드 , 정적 메소드도 존재
	 // 구현한 인터페이스의 추상메소드를 재정의
	@Override
	public void method3() {
		System.out.println("InterfaceAimpi:method2()이 호출됨");

	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	

}
