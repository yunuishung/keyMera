package study.chap07_abstract;

public abstract class Smartphone extends Phone {

	public static Smartphone sp;
	public Smartphone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
		  
		     //메소드
			public void internetSearch(String ur1) {
				System.out.println( ur1  + "을 검색합니다");
		}
			@Override
			public void turnOn() {
			     System.out.println("스마트폰을 켭니다");
			}
			// 부모가 정의한 turnOff() 메소드:재정의를 하지 않음
			//sendMessage: 추상메소드는 강제로 재정의 해주어야 함
			@Override
			public void sendMessage(String message) {
				 System.out.println( message +"를 보냅니다");
				
			}
			// 추상메소드 : 구체적으로 실행문을 정의 안한 것
			  public abstract void sendMessage(String message) {
				  
			  }

		



	}


