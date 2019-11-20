package study.chap07.method_Override;

public class LaserPrinter extends Printer {
 // 부모 객체의 print()메소드를 가지고 있음
	//레이저 프린트이므로 나만의 방식으로 출력을 하고자 함
	//메소드 오버라이딩(Override) <-> Overloading(매개변수 타입 ,순서 ,개수)
	//메소드를 재정의 (Overriding)
	@Override
	public void print(String data) {
		System.out.println("레이저로 출력합니다( " +  data +  ")");
		//super.print(data); // 디폴트가 부모의 메소드를 사용
	}
}
