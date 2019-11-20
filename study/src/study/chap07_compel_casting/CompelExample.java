package study.chap07_compel_casting;

public class CompelExample {

	public static void main(String[] args) {
		  Parent parent = new Child();   // 자동 타입변환
		  //자식객체를 부모타입의 변수로 대입
			  parent.pf1 =  10;  // 부모가 정의한 필드
			  parent.pmethod1(); //자식이 재정의한 메소드가 호출됨
			  parent.pmethod2(); //  자식이 재정의한 메소드가 호출됨(재정의의 규칙)
		//	  parent.cf1 = 20;  // 식의 필드는 부모타입으로 접근 불가능
		//	  parent.cmethod(); //자식이 정의한 필드에는 부모타입으로 접근 불가능
			  Child child = (Child)parent; // 강제타입 변환
			  child.cf1 = 20;
			  child.cmethod1();
           Parent p2 = new Parent(); // 생성한 객체 : 부모
           p2 = parent;
           if(p2 instanceof Child) {
        	   Child c2 = (Child) p2;  // 강제타입 변환
               c2.cf1 = 20;
               System.out.println("***");
           }
         
	}

}
