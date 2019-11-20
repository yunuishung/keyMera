package study.chap07_compel_casting;

public class Child extends Parent {
	 // 부모 필드 pf1 , 메소드 pmethod1(), pmethod2() 사용 가능
	 // 자신의 필드 
	 int cf1;
	
       //메소드
	  //부모의 메소드를 재정의
	 
	 @Override
	public void pmethod1() {
		  System.out.println("pmethod1(재정의)이 호출됨");
		  
		
	}
	  // 메소드
	 public void cmethod1() {
		 System.out.println("cmethod1()이 호출됨");
	 }
}
