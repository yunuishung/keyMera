package study.chap08_Interface_usage;

public class InstanceofExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		RemoteControl rc = new SettopBox(); // 왼쪽 인터페이스 타입 변수이름 = new 구현객체();
	//	rc.volume(10); // 구현객체에서 정의한 필드
		// 강제 타입 변환
		SettopBox sb = (SettopBox)rc;
		if(rc instanceof Television) {
		Television tv = (Television)rc; // 성공 -> Error (ClassCastException 발생) 
		}	else if (rc instanceof SettopBox) {
			SettopBox s2 = (SettopBox)rc;
		}
		

	}

	}

