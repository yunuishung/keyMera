package study.chap08_Interface_Inherit;

public class MultiFuntion implements MultipleRemoteControl {

	@Override
	public void turnOn() {
		System.out.println(" 다기능 TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("다기능 TV를 켭니다");
	}
 
	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨을  " + volume +" 를 합니다");

	}
   // Seacherble 인터페이스에 있는 추상메소드를 재정의
	@Override
	public void search(String ur1) {
		

	}
	public void changeChannel (int channel) {
		
	}

	@Override
	public void setMute(boolean mute) {
	
		
	}

}
