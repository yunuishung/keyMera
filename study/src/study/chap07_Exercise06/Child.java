package study.chap07_Exercise06;

public class Child extends Parent {
private String name;
	
     //breakPoint : 프로그램의 실행을 멈추는 지점
	public Child() {
		this("홍길동");
		System.out.println("child() Call");
	}

	public Child(String string) {
		this.name = name;
		System.out.println("child(String name)call");
	}
}

