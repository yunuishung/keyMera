package study.chap05;

/*
 * 이차원 배열
 * arr[][]
 */


public class TwoDimen {

	public static void main(String[] args) {
		//2차원 배열의 생성
		int arr1[][] = {{1,2,3,}, // 3개
				{1, 2, 3, 4}, // 4개
				{1, 2, 3, 4, 5} // 5개
		};
	     for (int i = 0; i< arr1.length; i++) { //행(3)
	    	 System.out.println("arr1[" + i +"]의 길이 = " + arr1[i].length);
	    	 for (int j = 0; j < arr1[i].length; j++) {
	    		 System.out.println(arr1[i][j] + " ");
	    	 }
	    	 System.out.println();
	     }
	  System.out.println("*******************");
	  //배열을 각각 생성하는 방법
	 
      int arr2[][] = new int[3][];  //행의 배열을 생성
      for (int i = 0; i< 3; i++) {
    	  arr2[i]= new int [i + 3]; //열의 배열을 생성
	}
      int num = 1;
      for (int i = 0; i< arr2.length; i++) {
    	  for (int j = 0; j < arr2[i].length; j++) {
    		  arr2[i][j]= num++;
    		  
    		  
    		  for (int i = 0; i < arr2.length; i++) {
    			  for (int j = 0; j < arr2[i].length; j++) {
    				  System.out.print(arr2[i][j]+ " ");
    			  }
    		  }
    		  
    	  }
    	  System.out.println();
      
      }
	}
}
	

