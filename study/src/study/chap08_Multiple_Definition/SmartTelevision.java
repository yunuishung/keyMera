package study.chap08_Multiple_Definition;

public interface SmartTelevision extends RemoteControl {

	public void turnOn() {
		System.out.println("스마트 TV 전원을 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV 전원을 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("볼륨을 " + "합니다 ");
		

	}

}

}
}
