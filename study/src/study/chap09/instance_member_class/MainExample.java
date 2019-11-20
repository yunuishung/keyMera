package study.chap09.instance_member_class;

public class MainExample {

	public static void main(String[] args) {
  OuterClass outer = new OuterClass();
  //InnerClass: 인스턴스 멤버 클래스
   OuterClass.InnerClass instanceClass = new OuterClass.InnerClass();
   instanceClass = outer.new InnerClass();
 
	}
	//정적 클래스
	OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass();
	staticClass.num = 20;
	staticClass.snum = 3;
	OuterClass.StaticInnerClass.method2();

}
