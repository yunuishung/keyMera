package study.chap05;

public class Exercise08 {

	public static void main(String[] args) {
		int [][] arr= {  
				{ 95, 86 },
				{ 83, 92, 96},
				{ 78 , 83, 93, 87, 88}
		};
		
		//작성위치
		//행에 대하여 반복
		for(int i=0; i <arr.length; i++ ) {//행에 대하여 i(행) 0~2
			for(int j=0; j <arr[i].length; j++ ) {  //행에 대한 열:j
				// i=0, j :0~1 arr[0].length =2
				// i=1, j :arr[1].length =3 0~2
				// i=2, j :arr[2].length =3 0~4
				 
				 
			}
			     System.out.println();
		}
		    
		
		
		
		int sum = 0;
		double avg = 0.0;
		int count= 1;
		
		for(int i=0; i <arr.length; i++ ) {//행에 대하여 i(행) 0~2
			count += arr[i].length;
		}
			for(int j=0; j <arr[i].length; j++ ) {  //행에 대한 열:j
				// i=0, j :0~1 arr[0].length =2
				// i=1, j :arr[1].length =3 0~2
				// i=2, j :arr[2].length =3 0~4
				 sum += arr[i][j];
		
		
		System.out.println("sum: " +  sum);
		System.out.println("avg: " +  avg);
		
		}
	   
	
			System.out.println("");
    
		}
		
	}


