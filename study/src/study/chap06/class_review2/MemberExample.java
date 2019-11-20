package study.chap06.class_review2;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		//키보드로부터 데이터를 입력 받기 위해 사용하는 클래스(라이브러리)
		String id;
		String name;
		String pw;
		String phone;
		String email;
		Scanner scanner = new Scanner(System.in) ;
		//회원가입: id ,name , password , phone ,email
		System.out.print("아이디:");
		id = scanner.next();
		System.out.print("이름:");
		name = scanner.next();
		System.out.print("비밀번호:");
		pw = scanner.next();
		System.out.print("휴대폰번호:");
		phone = scanner.next();
		System.out.print("이메일주소:");
		email = scanner.next();
		Member member = new Member(id, name, pw, phone, email);
	//데이터를 저장하는 객체를 하나만 생성해서 그 객체를 통해서를 데이터를 관리
		CommonData Store = CommonData.getInstance();
		Store.data[Store.count]=member;
		Store.count++;
		
		scanner.close(); // 입력받은 scanner를 OS에 반납
		final int num = 10; // 상수
	    final int num2 = 10;
		//num = 20;   // 변경 불가
		
	

	}
}
