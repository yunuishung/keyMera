package study.chap08_Interface_review_Interface;

public interface IChild extends IDatabase {
  //default 메소드를 가진 인터페이스를 상속하는 경우
	//경우 1: 부모 인터페이스에서 정의된 default 메소드를 정의
	//경우 2: 재 정의
	//경우 3: default 메소드를 추상메소드를 변경해서 사용
}
