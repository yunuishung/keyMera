package study.chap06constructor;



public class Car {
	//생성자를 정의 하지 않음 -> default 생성자가 존재한다
	//  public Car() { //default 생성자 (매개변수가 없음)
		//실행 내용은 있어도 없어도 된다 (일반적으로 없음)
		//디폴트 생성자는 정의하지 않아도 존제하므로 정의 하지 않는다
		
	   // 생성자: 디폴트 생성자가 아닌 다른 생성자가 존재하면 default 생성자는 없다
	public Car(int speed) { // 초기값으로 설정하고 싶은 값을 매개변수로 받는다
		this.speed = speed;
		
	}
   public Car(int speed, int seat) {
	   this.speed = speed;
		this.seat = seat;	
		//생성자 오버로딩(Constuctor Overloading) 다양한 초기화 방법을 제공 -> 매개변수를 다른 생성자 정의 가능
	
   }
   //매개변수 순서 ,타입 , 갯수에 의해서 구별
  public Car(String model ,String color , int speed) {
	  this.model = model;
	  this.color = color;
	  this.speed = speed;
	  
	  
  }
  public Car(int seat ,String color , String model) {
	  this.model = model;
	  this.color = color;
	  this.speed = speed;
	  
  }
/*  
  public Car(int a ,String b , String c) {
	  this.model = model;
	  this.color = color;
	  this.speed = speed;
*/   
	}
	


