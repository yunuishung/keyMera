package study;

public class Exercise04 {

	public static void main(String[] args) {
		int pencil = 534;
		int student = 30;
		
		//학생 한명이 가지는 연필 수
		int pencilsPerStudent =(pencil / student);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft =(pencil % student);
		System.out.println(pencilsLeft);


	}

}
