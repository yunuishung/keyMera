package study.chap06.getter;

public class MemberExample {
    //Getter , Setter: 데이터 보호(엉뚱한 데이터가 저장되지 않게)
	//직접 접근하는 방법을 허용하면 엉뚱한 값이 들어갈 수 있다
	//필드에 접근은 Getter 와 Setter를 통해서 접근하도록 변경
	public static void main(String[] args) {
		/*
		 Member member = new Member("hong","홍길동" ,"1234", "1111", "hong@naver.com");
		 Member lee = new Member();
		 lee.setId("lee");
         lee.setName("이순신");
         lee.setPw("1234");
         lee.setPhone("1111");
         lee.setEmail("lee@gmail.com");
         System.out.println("아이디: " + member.getId());
         System.out.println("이름: " + member.getName());
         System.out.println("비밀번호: " + member.getPw());
         System.out.println("전화번호: " + member.getPhone());
         System.out.println("이메일: " + member.getEmail());
         */
         //매개변수의 수가 가변될 경우: 2개, 3개...
        int sum = add(10, 20, 30 , 40, 50, 60);
        System.out.println("합: " + sum);
         sum= add(10, 20);
         System.out.println("합: " + sum);
         sum= add(10, 20, 30 );
         System.out.println("합: " + sum);         
	}
    private static int add(int...data) { //매개변수를 가변으로 받을 때 사용
     //data: 배열    	
    	int sum = 0;
    	for(int i = 0; i <data.length; i++) {
    		sum+= data[i];
    	}
    	return sum;
    }
	

}
