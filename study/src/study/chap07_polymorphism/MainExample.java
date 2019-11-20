package study.chap07_polymorphism;

public class MainExample {

	public static void main(String[] args) {
		 Dog dog = new Dog();// 개
         dog.age = 11; //부모가 정의한 메소드
         dog.sound();  // 멍멍(자식이 재정의한 메소드)
         dog.method1(); //부모가 정의한 메소드
         dog.count = 2; // 자식이 정의한 메소드
         //참조변수 Dog를 사용해서 접근 가능한 것 - > 부모 + 자식
	

	 
	
      //자동타입변환: 부모객체가 자식객체를 대입하는 것
	 Animal animal = dog;
	 animal.kind = "개";  // 부모가 정의한 필드
	 animal.age = 10;    // 부모가 정의한 필드
	// animal.count = 2; // 에러  -> animal 참조변수는  Animal
	 // 타입이므로 부모가 정의한 필드와 메소드만 접근 가능
	// animal.method();  // 에러
	 animal.sound();  // 부모가 부모 메소드 -> 예외
	 animal.method1(); 
	 animal.method2();
	 
	 Animal a2 = new Cat();
	 a2.sound(); // 부모의 메소드가 호출되지 않고 자식이 재정의 한다
	 // 대입한 자식의 성격 (메소드가 실행된다) -> 다형성
	 //1. 자동타입변환
     //2. 자식이 부모의 메소드를 재정의
	  method(dog);
	  
	}		

	private static void method(Dog dog) {
		// 매개변수 dog으로  전달된 것을 이용할 수 있음
	    dog.age = 10;
	    dog.sound();
	}
	
	}	
