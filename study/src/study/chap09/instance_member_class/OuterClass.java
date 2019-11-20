package study.chap09.instance_member_class;

public class OuterClass {
	//인스턴스 멤버 클래스 : 객체 (OuterClass)가 생성이 되어야 사용
   public static class  InnerClass {
	   //필드 , 생성자 , 메소드
	   //필드: 인스턴스 필드 ,정적 필드
	   int num = 10;
	//   static int snum = 30; // 허용 안됨(사용 불가)
	   
	   // 메소드 : 인스턴스 메소드 ,정적 메소드
	   void method1() {
		   
	   }
//	   static void method2() { // 허용 안됨(사용 불가)
		   
	   }
	//정적 클래스: 객체(OuterClass)의 생성없이 사용 가능
   public static class  StaticInnerClass {
	   //필드 , 생성자 , 메소드
	   //필드: 인스턴스 필드 ,정적 필드
	   //인스턴스 필드: 객체(Static InnerClass)의 생성으로 접근
	   int num = 10;
	   // 정적 필드: 객체 생성없이 접근 가능
	  static int snum = 30; // 허용됨(사용 가능)
	   
	   // 메소드 : 인스턴스 메소드 ,정적 메소드
	   void method1() {
		   
	   }
	   // 정적 메소드
      static void method2() { // 허용됨(사용 가능)
		   
	   }
   }
   }   

