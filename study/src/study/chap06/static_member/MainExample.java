package study.chap06.static_member;

public class MainExample {

	public static void main(String[] args) {
		 int result = Calculator.plus(10, 20);
		 System.out.println("result= " + result);
		 System.out.println("원의 면적= " +Calculator.culculatorArea(5.0));
         //시간 : 객체 하나만 유지 -> 시간 정보를 저장
		 System.out.println("result= " +Calculator.minus(30, 20));
	}

}
