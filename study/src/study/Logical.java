package study;

//논리연산자 : A && B , A || B, !A , A & B, A | B
//C언어: ! ,&&, ||

public class Logical {

	public static void main(String[] args) {
		int num= 10;
		int var1= 20;
		int a;
		int b= 10;
		
		 //A가 false 이더라도 B가 true인지 false인지 판단안하고 실행 안함
		boolean flag=((a = num) >11) &&((b = var1) < 20);
		//A : (a = num) > 11),&&((b = var1) < 20)
		System.out.println("flag="+ flag+", a="  +   ", b ="+ b );
		
		//자바에서 추가된 기능:  A가 false 이더라도 B가 true인지 false인지 판단한다.
		flag = ((a = num)>11) &((b = var1) < 20);
		System.out.println("flag="+ flag+", a=" + ", b=" + b );
	

	
}
}
