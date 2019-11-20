package study.chap07_protected2;

import study.chap07_protected1.Car;
 //다른 패키지에 있는 클래스 Car를 상속 받음
public class ClassD extends Car {
	public void method() {
		Car car1 = new Car();
		f1 = 10;  // public만 가능하다 
		f2 = 10;  //protected
	    f3 = "문자열"; // default
		f4 = 10; // private
}
