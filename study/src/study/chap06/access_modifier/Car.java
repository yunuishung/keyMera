package study.chap06.access_modifier;

public class Car {
    // 필드
	public int field1; // 모든 클래스에서 접근 가능
	protected int field2;  // 다른 패키지에 있는 클래스에서 접근 불가능, 
	                       // 예외 상속 받은 클래스는 접근 가능
	int field3;           // 접근 제한자를 지정하지 않으면 default
	
    private int field4;          // 같은 패키지내에 있는 클래스에서 접근 가능
	private String str;
	                     // 자신 클래스 내에서만 접근
	//생성자
	 public Car() {}
	 private Car(int value) {
		 this.field1 = value;
	 }
	 public Car() {}
	 public Car(String value) {
		 this.str = value;
	 }
	 public Car(double d){
		 
	 }
	 public void method1() {
		 System.out.println("method1()");
	 }
	 public void method2() {
		 System.out.println("method2()");
	 }
	 
	 public void method3() {
		 System.out.println("method3()");
	 }
	 
	 public void method4() {
		 System.out.println("method4()");
	 }
	 
	   /*
	//메소드
    public void method1() {}
    protected void method2() {}
    void method3() {}
    private void method4() {}
    	*/
    
    
}
