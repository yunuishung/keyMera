package study.chap06class_review;

public class AirplaneExample {
	
	public static void main(String[] args) {
		Airplane a1 = new Airplane();
		Airplane a2 = new Airplane("보잉");
		Airplane a3 = new Airplane(900, "록히드");
		a3.height = 10000;
		a2.speed =500;
		System.out.println("제조사: " + a1.company);
		//height = 10000; // x : 접근 불가 -> 언제나 참조 변수를 통해서 접근 가능
		new Airplane("보잉");
		System.out.println();
	}

}
