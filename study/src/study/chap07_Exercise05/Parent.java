package study.chap07_Exercise05;

public class Parent {
  public String name;
  
  
  // 기본 생성자가 정의되어 있지 않음
   public Parent() {}
  // 기본 생성자가 필요하면  꼭 정의를 해주어야 함
  
  // 디폴트 생성자가 아닌 다른 생성자
  public Parent(String name) {
	  this.name = name;
  }
	
	
}
