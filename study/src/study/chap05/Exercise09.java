package study.chap05;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//차이점: 점수를 입력 받는다 -> 최고 점수와 평균 점수
		//점수: 최소값:0  최대값: 100
		//최대값에 대한 초기치:
		//메뉴를 선택: 1. 학생수 (배열의 크기)
		//         2.정수 입력-> 배열에 저장 , 최대값과 합을 구한다
		//         3.점수 리스트: 배열을 출력
		//         4.분석. 최고점수, 평균 출력
	    //         5.종료	 
		int max = -1; //초기치는 최소값  -> 입력 데이터는 최대값
		boolean run = true; // 메뉴를 입력 받기 위한 반복문
		int studentNum= 0;
		Scanner scanner = new Scanner(System.in);
		int scores[]=null; // 1차원 배열 선언 (참조 변수)
		int sum;  // 총점 
	    double avg; // 평균
		 
        
		while(run) { // 무조건 반복 
			// 특정 조건: 종료 메뉴를 선택  -> 반복문을 벗어나도록 처리
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 함수 입력 | 3. 점수 리스트  |4. 분석  |5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			
			
			int selectNo = scanner.nextInt(); // int 입력(메뉴)
			
			if(selectNo == 1) {
				// 학생 수  > 3
				System.out.print("학생수 > "); // 학생수 >
				studentNum = scanner.nextInt();
				//배열을 생성
				scores = new int [studentNum]; 
										
			}else if(selectNo == 2) { //정수 입력
				//학생 수 만큼 점수를 입력
				//scores[0] > 80
				for(int i = 0; i < studentNum; i++) {
				System.out.print("scores[" + i  +"]> ");
				scores[i]= scanner.nextInt();
				
				
			}
		}else if (selectNo == 3) {
			for(int i = 0; i < studentNum; i++) {
				//scores[0]; : 85
				System.out.println("scores[" + i  +"]: " +  scores[i]);
		}
				
	}  else if(selectNo == 4) { // 분석 : 최고 점수, 평균 점수 출력
		//최고 점수: 95
		//평균 점수: 91.0
	
		max = -1; // 메뉴를 4. 분석을 선택할 때 마다 다시 계산
		sum =0; 
		
		for(int i = 0; i < studentNum; i++) {
			// 새로운 최대값을 구한다.
			if(max < scores[i])
			   max = scores[i];
			//합을 구한다.
			sum += scores[i];
		}
		 avg = (double)sum / studentNum;
		 System.out.println("최고 점수: " + max);
		 System.out.println("평균 점수: " + avg);
		
	}   else if(selectNo == 5) {
		run = false;
	}
	
	System.out.println("프로그램 종료");
	}
	
	}	
}



