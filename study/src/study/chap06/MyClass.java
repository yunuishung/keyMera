package study.chap06;

public class MyClass {
   //구성 멤버
   //1.필드 : 클래스의 속성, 상태, 구성품
	int field1;
	String field2;
	
	// 2. 생성자 : 필드 값의 초기화 -> 일종의 메소드(반환형이 없음)
       public MyClass() {
    	  this.field1 = 10; // 초기화
    	  field2= "현대";
    	   
       }
       // 3. 메소드 : 필드값을 변경시키는 동작 ,행위
         public void method() {  //필드를 사용한 메소드
        	 System.out.println("field1= " + field1 );
        	 
         }
         //add
         public int method2(int a , int b) { // 필드를 사용하지 않은 메소드
        	 return a + b;
         }
         
         // 필드 field1의 값을 매개변수로 전달된 field1으로 설정(저장)
         public void setField1(int field1) { // 매개변수가 필드명과 같을 경우
        	 this.field1= field1; //일반적으로 같은 이름을 많이 사용한다.
        	     field3= 10;              // 필드와 매개변수를 구별하기 위해서  "this"를 사용
         }
         public void setField1(String f2) { // 매개변수가 필드명과 같을 경우
        	 field2= f2; //일반적으로 같은 이름을 많이 사용한다.
        	 
         }
         int field3;
	}


