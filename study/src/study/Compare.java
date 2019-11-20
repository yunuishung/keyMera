package study;

public class Compare {

	public static void main(String[] args) {
		//String: 라이브러리(클래스)
		//int num;
		// 구조체: C언어 연관성
		// str1: 포인터 char* ptr+ "홍길동";
		 String str1 = "홍길동";
		 String str2 = "홍길동";
		 String  str3 =  new String ("홍길동");
		 if(str1 == str2) {
			 System.out.println("동일한 (같은 객체) 값이다");
		 } else {
				 System.out.println("다른 객체이다");
		 }
		 if(str2 == str3) {
			 System.out.println("동일한 (같은 객체) 값이다");
		 } else {
				 System.out.println("다른 객체이다");
		 }
		  if(str1.equals(str2)) {
			  System.out.println("같은 내용입니다");
		  }
		  else {
			  System.out.println("다른 내용입니다");
			  
			  if(str2.equals(str3)) {
				  System.out.println("같은 내용입니다");
			  }
			  else {
				  System.out.println("다른 내용입니다");
			  }
		  }
	}
		 }
	


