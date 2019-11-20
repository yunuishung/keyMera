package study.chap08_abstract_class;

public class InterfaceExample {

	public static void main(String[] args) {
      InterfaceA ia = new InterfaceAimpi(10);  // 자동 타입변환
      // 인터페이스에서 정의한 부분만 보인다(사용 가능)
      ia.method1();
      ia.method2();
//    ia.method3(); // 인터페이스 타입이므로 안보인다
      InterfaceAimpi ii = (interfaceAimpi)ia; // 강제 타입변환
      ii.field1 = 20;
      ii.method3();
      // 익명구현객체: 사용되는 곳에서 정의를 해서 상ㅇ
      InterfaceA c =new InterfaceA() {
    	  @Override
    	public void method1() {
    		System.out.println("셋탑박스의 method1() 호출됨");
    		int sum = add(10 ,20);
    	}
    	  int add (int a , int b) {
    		  return a + b;
    	  }
      };
       c.method1();
 //      c.field2 = 10; // 구현 객체에서 선언한 필드 ,메소드는 사용 불가

	}

}
