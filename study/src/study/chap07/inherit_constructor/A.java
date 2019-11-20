package study.chap07.inherit_constructor;

public class A extends B {

	private int f1;
	private String s1;

	public A(int f1, String s1) {
	super(f1, s1);
	 this.f1 = f1;
	 this.s1 = s1;
	}
}
