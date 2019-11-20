package study.chap06_problem15;

public class MemberService {
	// 메소드
	boolean login(String id, String password) {
		// 조건문 == 주소 비교
		if(id.equals("hong") && password.equals("12345"))
			return true;
		else 
			return false;
	}
	
	 void logout(String id) {
		 //"로그아웃 되었습니다"가 출력되도록 프로그램 하라.
		 System.out.println("로그아웃 되었습니다.");

	
	
   }
}
