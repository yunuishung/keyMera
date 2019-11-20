package study.chap08_Polymophism;

public class Car {
  Tire fl = new HanKookTire("앞왼쪽 ",5);
  Tire fr = new HanKookTire("앞오른쪽", 3);
  Tire bl = new NesenTire("뒤왼쪽 ",4);
  Tire br = new NesenTire("뒤오른쪽 ",6);
  
   // 운행 메소드
  // 타이어를 회전하면서 운전 : 고장난 타이어의 위치를 알려준다
  public int run() {
	  System.out.println("자동차가 굴러갑니다");
	  if(!fl.roll()) { // 타이어 펑크 발생
		  System.out.println("앞왼쪽 펑크 발생");
		  stop(); 
		  return 1; // 고장난 바퀴위치 (1 : 앞왼쪽)
	  }
	  if(!fr.roll()) {
		  System.out.println("앞오른쪽 펑크 발생");
		  stop();
		  return 2;  
	  }
		  if(!bl.roll()) {
			  System.out.println("뒤왼쪽 펑크 발생");
			  stop();
			  return 3;
		  }
		  if(!br.roll()) {
			  System.out.println("뒤오른쪽 펑크 발생");
			  stop();
			  return 4;
		  }
		  return 0; // 펑크 발생 안함
	  }


private void stop() {
	// TODO Auto-generated method stub
	
}
  }

