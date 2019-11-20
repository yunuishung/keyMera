package study.chap06.Final;

public class PersonExample {

	   public static void main(String[] args) {
		   Person p1=  new Person("123456-1234567", "hong");
		   System.out.println(p1.ssn);
		   System.out.println(p1.name);
		   
		   p1.nation = "USA";
		   p1.ssn="123456 - 1234567";
           p1.name="JSP";
           
           int num  = p1.MAX_PAGE;
	}
	   Person p2 new Person("222222-3333333", "홍길동");
	    
}
