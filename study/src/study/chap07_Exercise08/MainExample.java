package study.chap07_Exercise08;

public class MainExample {

	public static void main(String[] args) {
		 B b = new B();
		 b = (B) new A(); // 컴파일 에러가 발생 안함
		  // 프로그램이 실행할 때 ClassCastException()이 발생
		 // RunTimeException이 발생
		 b = new D();   // 자동타입변환
		 b = new E();   // 자동타입변환
	}

}
