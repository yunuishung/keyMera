package study.chap07_protected1;

public class Car {
	// 필드
	  public int f1;
	  protected int f2;
	  int f3;
	  private int f4;
	  
	 //생성자
	 public Car() {
		 System.out.println("Car()");
	 }
	 protected Car(int f1) {
		 System.out.println("Car(f1)");
	 }
	 Car(String f3) {
		 System.out.println();
	 }
		 private Car(int f1 , String f3) {
			 System.out.println("Car(f1, f3)");
		 }
		 //메소드
	
	  public void method1() { }
      public void method2() { }
      public void method3() { }
	  public void method4() { }
	  
}