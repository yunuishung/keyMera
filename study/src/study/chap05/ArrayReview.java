package study.chap05;

import java.util.Scanner;

public class ArrayReview {

	public static void main(String[] args) {
		  //일차원 배열
		int[] arr1 = {1, 2, 3, 4}; // 배열의 크기가 4인 배열
		for(int i =0; i <arr1.length; i++ ) {
			System.out.print(arr1[i]+ " ");
			
		}
		System.out.println(); //줄 바꾸기
        
		int arr2[];
		//arr2 = {1, 2, 3, 4, 5};  // 에러 발생
		//선언과 함께 초기화를 수행하여야 함
		
		arr2 = new int [5];
		int num= 1;
		for(int i=0; i <arr2.length; i++) {
			arr2[i] = num++;
		}
		for(int i=0; i <arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
		System.out.println();
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("배열의 크기");
		int len = scanner.nextInt();
		double darr[] = new double[len]; //배열의 크기를 변수로 지정
		System.out.println("배열 darr 크기=  " + darr.length);
		*/
		
		int arr3[] = new int [5];
		for(int i=0; i < arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
		}
		System.out.println();
		}
		
		
	}


