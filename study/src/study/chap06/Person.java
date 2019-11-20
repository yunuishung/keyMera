package study.chap06;

public class Person {
	//필드
	String name;
	String ssn;
	String birthday;
	
	double height= 10.0; // 키
	double weight= 2.5;// 몸무게
	
	
	public Person() {
		System.out.println("키:  " + height);
		height = 20.0;
	}

}
