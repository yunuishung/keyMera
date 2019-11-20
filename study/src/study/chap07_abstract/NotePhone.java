package study.chap07_abstract;

public class NotePhone {
    //메소드
			public void internetSearch(String ur1) {
				System.out.println( ur1  + "을 검색합니다");
		}
			public void turnOn() {
			     System.out.println("스마트폰을 켭니다");
			}
			
			public void turnOff( ) {
				System.out.println("스마트폰을 끕니다");
				
			}
			// 부모가 정의한 turnOff() 메소드:재정의를 하지 않음
			//sendMessage: 추상메소드는 강제로 재정의 해주어야 함
			public void sendMessage(String message) {
				 System.out.println( message +"을 전송합니다");
				
			}
			
		
			}