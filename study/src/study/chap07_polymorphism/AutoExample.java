package study.chap07_polymorphism;

public class AutoExample {

	public static void main(String[] args) {
		 B b = new B();
		 C c = new C();
		 D d = new D();
		 E e = new E();
	     B b2= d;
	     b2 = c;
	     b2 = e;

	}

}
