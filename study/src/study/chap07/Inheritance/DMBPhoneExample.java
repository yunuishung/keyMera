package study.chap07.Inheritance;

public class DMBPhoneExample {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.powerOn();
		cp.sendMessage("안녕");
		String msg = cp.receiveMessage();
		cp.powerOff();

	
	    DmbPhone dp = new DmbPhone();
	    dp.dmb_powerOn();
		dp.sendMessage("부모의 메소드를 이용");
		String msg = dp.receiveMessage();
		dp.dmb_powerOff();

	}		

}
