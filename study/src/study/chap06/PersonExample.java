package study.chap06;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 =new Person(); //객체가 생성 될 때는 name = null로 초기화 됨
		System.out.println("키: " + p1.height); // 초기화 한값 10.0
		System.out.println("이름  " + p1.name ); //  초기화 하지 않음
	//	height = 20.0; // Person 클래스의 필드의 필드명만 사용해서 접근 불가능
		p1.height = 20.0; //실제가 있어야 접근 가능
	}

}
