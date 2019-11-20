package study.chap06.class_review2;

public class Member {
   private String id;
   private String name;
   private String pw;
   private String phone;
   private String email;
   final String nation= "korea"; // final 변수에 대해서 초기화 위치  1. 선언과 동시에 초기화
                                 // 2. 선언과 함께 초기화 하지 않을 경우는 생성자에서 초기화를 수행   
public Member(String id, String name, String pw, String phone, String email) {
	this.id = id;
	this.name = name;
	this.pw = pw;
	this.phone = phone;
	this.email = email;
}
   
}
