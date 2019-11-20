package study.chap05;

public class Equals {
	
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String ("홍길동");
		String str4=  new String ("홍길동");
		
		if(str1 == str2)  // 주소 비교
			System.out.println("같은 객체를 참조");
		else 
			System.out.println("다른 객체를 참조");
		
		if(str2 == str3)  // 주소 비교
			System.out.println("같은 객체를 참조");
		else 
			System.out.println("다른 객체를 참조");
		
		//객체의 내용 비교
		
		if(str1.equals(str2)) //내용 비교
			System.out.println("같은 내용(값)");
		else
			System.out.println("다른 내용(값)");
		
		if(str2.equals(str3)) //내용 비교
			System.out.println("같은 내용(값)");  // 예상
		else
			System.out.println("다른 내용(값)");
		
		
	}

}
