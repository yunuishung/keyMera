package study.chap06class_review;

public class Airplane {
	//구성 멤버: 필드, 생성자, 메소드
	//필드 : 속성 , 상태  ,부품 , 소유물.....
	
	String company = "보잉"; // 제조사 : 보잉
	String owner = "대한항공"; // 보유회사 : 대한항공
	//클래스 정의 시 고정된 값을 가진다.
	int speed; // 속도
	    // 초기값을 정의하지 않음
	int height; // 고도
    int seatNum;  //승객 수
    
    Engine engine; // 부품
    Wheel front; // 앞 바퀴
    Wheel back;  //뒷 바퀴
    
    // 생성자
   // {  접근 제한자: public (x) -> default
    	//default 접근제한자 : 같은 패키지 내의 클래스에서 접근 가능
    	
    
    // 다른 생성자 -> 생성자 오버로딩(Over Loading) -> 매개변수의 타입 , 순서, 위치
    public Airplane(String company) {
    	this.company = company;
    }
    //public Airplane(String owner) { //위의 생성자와 구별을 못한다 : 허용 안됨
    	
    
    public Airplane(String company, int speed) {
    	this.company= company;
    	this.speed = speed;
    	 
    	
    }
    public Airplane(String company , int speed, int seat) {
    	this.company = company;
    	this.speed = speed;
    	seatNum= seat; // 매개뱐수와 필드명이 다르므로 this를 붙이지 않아도 된다
    }
}
