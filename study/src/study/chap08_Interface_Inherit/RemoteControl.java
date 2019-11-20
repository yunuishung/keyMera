package study.chap08_Interface_Inherit;

public interface RemoteControl {
	// 상수, 메소드
		   public static final int MAX_VOLUME = 10;
		    int MIN_VOLUME = 0; 
		    // 추상 메소드
		    public void turnOn();  
			public void turnOff();
			public void setVolume(int volume);
			
			//default 메소드
			  default void setMute(boolean mute) {  
			    	if(mute) {
			    		System.out.println("무음 처리를 합니다");
			    	}else  {
			    		System.out.println("무음 해제를 합니다");
			    	}
			    	
			}
		    
}
