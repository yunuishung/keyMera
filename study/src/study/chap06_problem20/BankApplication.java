package study.chap06_problem20;

import java.util.Scanner;

public class BankApplication {

	 private static Account[] accontArray = new Account[100];
	 private static int count = 0; // 계좌를 개설한 고객의 수
	 private static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		boolean run =true;
		while(run) {
		System.out.println("----------------------------------------");
		System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금| 5.종료");
		System.out.println("----------------------------------------");
		System.out.println("선택> ");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo == 1) {
			createAccount();
			
		 }  else if(selectNo == 2) {
			  accountList();	
		 }	else if(selectNo == 3) {
				deposit();		
		}  
			else if(selectNo == 4) {
				createAccount();		
		}  
			else if(selectNo == 5) {
				run = false;		
		}   else if (selectNo == 6) {
			
		}
		 }  		
		
	}

	private static void createAccount() {
		if(count  == 100) {
			System.out.println("계좌를 개설할 수 있는 최대 수를 초과하였습니다");
		  return;
	}
		System.out.println("------");
		System.out.println("계좌 생성 ");
		System.out.println("------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.println("계좌주: ");
		String owner = scanner.next();     // 문자열  next();
		System.out.println("초기입금액: ");
		int balance = scanner.nextInt(); //   int -> nextInt
		accontArray[count++] = new Account (ano ,owner , balance);
		System.out.println("결과: 계좌가 생성되었습니다");
		
		private static void deposit() {
			System.out.println("------");
			System.out.println("계좌목록 ");
			System.out.println("------");
			System.out.print("계좌번호");
			String ano = scanner.next();
			System.out.println("예금액");
			String ano = scanner.nextInt();
			int value = scanner.nextInt();
		}

		private String ano;
		
           Account account = findAccount(ano);
		private int value;
           if(account ! = null) {
        	   account.setBalance(value);
           } else {
        	   System.out.println("계좌를 먼저 생성하세요");
           
           
           
   
	private static void accountList() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		for(int i = 0;  i < count; i++) {
			//Account account = accountArray[i];
		    //System.out.println(account.getAno() + "t"
			//		account.getOwner() + "\t" + account.getBalance());
			System.out.println(accontArray.getAno);
		}
		}
	

	 private static Account findAccount(String ano) {
		 // accountArray
		 for(int i =0; i < count; i++) {
			 Account account  =  accontArray[i];
			 if(account.getAno().equals(ano)) {
				 return account;
			 }
		 }
	 }
	  return null;
}
