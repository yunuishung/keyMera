package study.chap07_polymorphism;

public class Animal {
	String kind; // 고양이 ,
	int age;
	String name;
	public void sound() {
		System.out.println("소리를 냅니다");
	}
        public void method1() {
        	System.out.println("Animal method()");
        }
        public void method2() {
        	System.out.println("Animal method1()");
        }
}
