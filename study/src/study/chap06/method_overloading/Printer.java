package study.chap06.method_overloading;

public class Printer {
	
	public void println(int data) {
		System.out.println("정수형 데이터");
		System.out.println(data);
	}
	
	public void println(double data) {
		System.out.println("실수형 데이터");
		System.out.println(data);
	}
	public void println(String str) {
		System.out.println("String형 데이터");
		System.out.println(str);
	}
}
