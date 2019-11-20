package study.chap08_Interface_usage;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨을"+ volume + "합니다 ");

	}

}
