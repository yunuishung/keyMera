package study.chap08_Polymophism;

public class Polymophism {
  public static void main(String[] args) {
	Car myCar = new Car();
	for (int i = 0; i < 10; i++) {
		int problemLocation = myCar.run();
		if(problemLocation == 1) {
			myCar.fl = new NesenTire("앞왼쪽", 15);		
		}else if(problemLocation == 2) {
			myCar.fr = new HanKookTire("앞오른쪽", 13);
		}
		else if(problemLocation == 3) {
			myCar.bl = new HanKookTire("뒤왼쪽", 12);		
		}else if(problemLocation == 4) {
			myCar.br = new NesenTire("뒤오른쪽", 14);
		}
	}
	  
}
}
