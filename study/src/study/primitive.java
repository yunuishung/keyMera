package study;

/*
 *데이터 타입
 *정수
 *char : 2byte (국제어를 지원하기 위해 Unicode(UTF-8)을 지원)
 *      0~2의 16슬 -1까지(음수는 없다)
 *C언어의 Char는 자바에서는 byte와 같다.
 *long 8 byte - > C언어의 long long에 대응
 *실수: C언어와 동일(float, double)
 *논리 : 참(true)과 거짓(false)을 저장 -> 1byte 크기
 *unsigned int 데이터 타입은 없다.
 */

public class primitive {  // 클래스 이름은 대문자로 시작(관습)
	public static void main(String[] args) {
		byte b1 = 0x23;
		char c1= '한';
		short s1= 432;
		int num = 30;   // default가 int
		long ll = 234L; //long임을 표시하기 위해 L을 추가 기술
		float f1= 0.43f; // float 형태의 리터럴
		double d1= 0.54; // default가 double
		boolean flag = true; // 논리형 (1byte , true or false)
		System.out.println("b1 =" +  b1);
		System.out.println("c1 =" +  c1);
		System.out.println("s1="  +  s1);
		System.out.println("ll="  + ll);
		System.out.println("num=" + num);
		System.out.println("f1="  +  f1);
		System.out.println("d1="  +  d1);
		System.out.println("flag=" + flag);
		
	}

}
