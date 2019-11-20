package study.chap08_anonymous;

 // public을 생략하더라도 public interface와 같다
public interface RemoteControl {
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	// public static final이 생략된 것임
	public static final int CONSTANT_VALUE= 10;
	//메소드 : 추상 , default , 정적 
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드 -> 실행부분이 있음
  default void setMute(boolean mute) {
     if(mute) {
    	 System.out.println("무음 처리");
     } else
    	 System.out.println("무음 해제");
   }
   // 정적 메소드 
   static void changeBattery() {
	   System.out.println("배터리를 교환합니다");
   }
}
