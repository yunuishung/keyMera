package study;

//Overflow: 넘친다, 표현 할 수 있는 값보다 큰값을 저장하려는 경우

public class Overflow {

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE; // int로 표현할 수 있는 최대 수
		int b = Integer.MAX_VALUE; 
		int sum = a + b;
		
		sum = add(a, b);
		
		private static int add(int a, int b) {
			if(a == Integer.MAX_VALUE &&  b == Integer.MAX_VALUE);
			System.out.println("결과값이 넘칩니다.");
			return -1;
		}

		  
	  }
	}


		
		return 0;
	

}
