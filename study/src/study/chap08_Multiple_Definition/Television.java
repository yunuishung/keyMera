package study.chap08_Multiple_Definition;

// 인터페이스를 구현한다(inplements)
// 참고로 상속관계에서는 상속한다(extends)
// 인터페이스 : 여러 개가 가능하다

public class Television implements RemoteControl { /* [HardDisk], 여러 개를 사용가능  */
	  // 필드
	int channel;
	
	// 생성자
	
	//메소드
	public void changeChannel(int channel) {
	this.channel = channel;
	
	}
    // interface RemoteControl에서 정의한 추상 메소드를 재정의(필수)
	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		System.out.println("텔레비전의 볼륨을" + volume + "으로 설정");

	}
	// 디폴트 메소드와 정적 메소드는 가지고 있다.
	
		
	}


