package study.chap07_Exercise06;

public class Parent {
	 public String nation;
	 
	  public  Parent() {
		  this("대한민국");
		  System.out.println("parent() Call");
		 
	 }

	public Parent(String nation) {
		this.nation =nation;
		System.out.println("Parent(String nation)");
	}
}
