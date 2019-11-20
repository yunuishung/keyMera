package study.chap07_protected;

import study.chap07_protected1.Car;

public class ClassC {
	public void method() {
		Car car1 = new Car();
		car1.f1 = 10;  // public만 가능하다 
		car1.f2 = 10;  //protected
		car1.f3 = "문자열"; // default
		car1.f4 = 10; // private
		
	}

}
