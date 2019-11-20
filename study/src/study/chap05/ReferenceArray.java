package study.chap05;

public class ReferenceArray {

	public static void main(String[] args) {
		//String 객체의 참조변수를 저장하는 배열 5개 생성
		 String arr[] = new String[5];  //null로 초기화됨
		 //arr[i]: String 객체의 주소를 저장해야 함
		 arr[0]= "홍길동"; // arr[0] : 참조변수
		 arr[1]= "자바";
		 arr[2]= new String("백두산");				 
		 System.out.println(arr[0].length()); // 홍길동을 가리킴
		 System.out.println(arr[3].length()); // null
  
		 
	}
	

}
