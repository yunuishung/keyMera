package study.chap06.getter;

public class BussinessMember extends Member {
    //부모가 정의한 필드 , 생성자 , 메소드도 존재하고 사용가능
	//나는 -> 나 부모가 정의한 메소드를  나만의 메소드 정의 
	
	//Override: 재정의 부모가 정의한 메소드를 나만의 방법으로 재정의
	@Override  //'@' annotation(어노테이션)
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
}
