package study.chap07.Inheritance;

public class CellPhone {
	  // 필드
	   String model;
	   String color;
	   
     //생성자
	   public CellPhone(String string, String string2) {
		   System.out.println("CellPhone() 생성자가 호출됨");
	   }
	 //메소드
	   public void powerOn() {
		   System.out.println("전원을 켭니다");
	   }
	   public void powerOff() {
		   System.out.println("전원을 끕니다");
	   }
	   public void sendMessage(String message) {
		   System.out.println(message + "를 전송합니다");
	   }
	   public String receiveMessage() {
	   System.out.println("메시지를 수신합니다");
	

	   
	   }
	   public CellPhone() {
		   System.out.println(String model ,String color);
		   this.model = model;
		   this.color= color
}    
