package study.chap07.inherit_constructor;

public class B  {
	
     private static Object f1;
	private static Object s1;
	private int f3;
	// 1. 디폴트 생성자
	// public B() {
	//	 super();
	//	   System.out.println("B() 생성자가 호출됨");
	 
 public B(int f1 , String s1) {
	  int f3;  
 }
 
 public B(int f1 , String s1 ,int f3) {
	  super(f1 ,s1);
	 
}
	 public B() {
		 super();
		 this.f3 = f3;
	 }
}
