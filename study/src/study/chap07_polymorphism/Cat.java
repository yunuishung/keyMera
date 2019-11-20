package study.chap07_polymorphism;

public class Cat extends Animal {
	int count;   // 1년에 털갈이 하는 횟수
    public void method() {
 	   sound(); // 부모가 정의한 메소드를 사용 할 수 있고 
 	   age = 10;  //개월: 부모가 정의한 필드를
    }       
    @Override
   public void sound() {
 	System.out.println("야옹");
 }
}
