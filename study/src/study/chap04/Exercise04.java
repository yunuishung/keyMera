package study.chap04;

public class Exercise04 {

	public static void main(String[] args) {
		int i= 1;  // 주사위 1번째
		int j= 1;  // 주사위 2번째
		while (i + j != 5) {
			i =rand();
			j= rand();
			System.out.println("(" + i + ", "+ j + ")" );
			
		}
			
		

	}
	//private static int generateRandomNumber() {
	//	
	//	return 0;
	//}
	private static int rand() {
		return (int)(Math.random()* 6 + 1);
		
		
	}

}
