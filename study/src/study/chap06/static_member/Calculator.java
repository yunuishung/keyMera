package study.chap06.static_member;

public class Calculator {
	
	// 정적 필드
	static double pi = 3.14159;
	
	//정적 메소드
	static int plus (int x , int y) {
		 return x + y;
		 
	}
	   static int minus(int x , int y) {
		   return x - y;
	   }
	  
	   static double culculatorArea(double radius) {
		   return pi * radius *radius;
	   }

}
