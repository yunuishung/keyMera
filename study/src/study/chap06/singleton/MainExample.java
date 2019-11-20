package study.chap06.singleton;

import java.util.Calendar;

public class MainExample {

	public static void main(String[] args) {
		System.out.println("호출함");
	//	Singleton s= new Singleton(); // 객체를 생성 불가
		Singleton s1= Singleton.getInstence();
		s1.data[0] = 10;
		System.out.println(s1.data[0]);
		
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		CommonStorage s3 =CommonStorage.getIn();
		System.out.println(s3.data);
		s3.data = 40;
		System.out.println(s3.data);
	}

}
