package study.chap07.Inheritance;

public class DmbPhone /* 자식 클래스 */  extends CellPhone { /* 부모 클래스 */  //extends
	int channal; // 현재 사용하는 채널
	private int dmbphone;
   
    //부모가 선언한 필드와 메소드를 사용 가능(존재함)
	public DmbPhone() {
		super("갤5","흰색");
		System.out.println("DMB폰 생성자가 호출됨");
	}
	public DmbPhone() {
		super("갤5","흰색");
		this.channal = channal;
	}
	
	public void method() { //자식의 메소드를 정의
		model = "갤8"; // 부모의 필드를 사용
		powerOn();    // 부모의 메소드를 사용
		
	}
	 public void changeChannel(int ch) {
		 channal = ch;
	 }
	 public void dmbPhone(int dp) {
		dmbphone = dp;
	 }
	 public void dmb_powerOn() { // 부가적인 부품의 초기화
		 System.out.println("DMB 폰을 켭니다");
	 }
	 public void dmb_powerOff() { // 부가적인 부품의 초기화
		 System.out.println("DMB 폰을 끕니다");
	 }
	 
}
