package study.chap08_Interface_Inherit;

public interface MultipleRemoteControl extends RemoteControl, Seacherble {
	//상수
	// RemoteControl: 추상 메소드 존재
	// RemoteControl Interface에서는 default 메소드 -> 추상메소드를 변경 가능
	void setMute(boolean mute);
	void changeChannel(int changeChannel);
	public static void main(String[] args) {
		
		// Seacherble: 추상 메소드 존재
		//자식 인터페이스의 추상 메소드를 새로 추가
		//default 메소드
		//정적 메소드
		
	}
}
