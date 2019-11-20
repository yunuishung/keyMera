package study.chap05;

public class Exercise07 {

	public static void main(String[] args) {
		int sum = 0;
		 int max= 0;
		 int [] arr = {1, 5, 3, 8, 2};
		  for(int i= 0; i <arr.length; i++) {
			  if(max < arr[i])
				 max = arr[i];
		  }
		
           System.out.println("max: " + max);
           System.out.println("---------------");
	
           max = 0;
	for(int num: arr) {
		  if(max < num)
			 max = num; 
	  }
	 System.out.println("max: " + max);
}
	 
}
