package study.chap08_abstract_class;

public interface InterfaceA {
   // 멤버: 상수 , 메소드
   // 접근 제한자 : public 
   // 상수
	int MAX_VOLUME = 20; // 변수가 아니라 상수 (public static final이 생략됨)
	public static final int MIN_VOLUME = 0;
	
	//메소드 : 추상 메소드(자바 버전 7....) ,default 메소드 (자바 8부터 추가) , 정적 메소드 (자바 8부터 추가)
	//추상 메소드 abstract 단어를 생략
	
	void method1(); // 선언부만 존재
		
	//default 메소드
	 
	default void method2() { // 실행부분이 존재
		System.out.println("이 부분은 실행부분 입니다");
	
		// 정적 메소드 
		static void setValue(int value) {
			System.out.println("값을 설정("+ value + ")");
		}
		// 없는 것: 생성자 , 필드(변수) -> 객체화 불가
		//인터페이스를 구현한 구현객체를 통해서  기능구현
	}

	
	
	
}
