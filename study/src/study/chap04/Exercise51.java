package study.chap04;

public class Exercise51 {

	public static void main(String[] args) {
		 
		  
		  for (int x = 0; x <= 10; x++) {  // x = 0 ~ 10
			  // 반목문 11 * 11
			  for (int y = 0; y <= 10; y++) // y = 0 ~ 10
				  if(4 * x + 5 * y == 60) { // (x,y)
				  
					  
					  System.out.println("(" + x + ", "+ y + ")" );
				  }
		  }
		  
	}
	
}


