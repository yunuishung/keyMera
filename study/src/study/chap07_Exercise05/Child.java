package study.chap07_Exercise05;

public class Child extends Parent {
  private int studentNo;
  
  public Child(String name, int studentNo) {
	  super(name); // 부모 Parent의 디폴트 생성자를 호출
	//  this.name = name; // 중복 실행 -> 코멘트로 막아준다
	  this.studentNo= studentNo;
  }
}
