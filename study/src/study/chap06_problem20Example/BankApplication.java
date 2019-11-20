package study.chap06_problem20Example;

import java.util.Scanner;

import study.chap06_problem20.Account;

public class BankApplication {
	  private static final int MAX_ACCOUNT = 100;  // 최대 계좌 수
	// 계좌정보를 저장하는 필드 : 배열
	  //1. 정적 필드로 선언하는 방법
    static Account accountArray[] = new Account[MAX_ACCOUNT];
    static int  count = 0;
    static BankApplication ba;
    //키보드로부터 데이터를 입력 받기 위하여
    static Scanner scanner = new Scanner(System.in);
    
     static Account accountArray2[];
	private static int i;
     int count2= 0;
     String jigum;
	private Account account;
	private int withdraw; //권선 ,터미널
      
	public static void main(String[] args) {
		//2. 인스턴스 필드를 사용하는 방법
	  accountArray = new Account[MAX_ACCOUNT];
	//	ba =  new BankApplication();
	//	ba.accountArray2 = new Account[MAX_ACCOUNT];
      boolean run = true;
      while(run) {  //메뉴를 입력받아서 처리하는 부분
    			System.out.println("------------------------------------------------------------");
    			System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금| 5.종료  |  6.잔액 조회" );
    			System.out.println("------------------------------------------------------------");
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
    					withdraw()		;
    			}  
    				else if(selectNo == 5) {
    					run = false;		
    			}   else if (selectNo == 6) {
    				retrieveAccount();
    			}
    			System.out.println("프로그램 종료");
    			 }  		
    		
    		}

	private static void retrieveAccount() {
		System.out.println("---------------------");
		System.out.println("예금");
		System.out.println("---------------------");
		System.out.print("계좌번호: "); // 줄을 바꾸지 않으므로 print()
		String ano = scanner.next(); // 문자열을 입력받을때 : next()
		System.out.print("예금액: "); // 줄을 바꾸지 않으므로 print()
		Account account =findaccount(ano);
		if(account == null) { // 계좌 검색이 실패
			System.out.println("계좌를 먼저 개설해주세요");
		} else { 
		     System.out.println(accountArray[i].getAno()+ "\t" + 
			accountArray[i].getOwner()+ "\t" +	
		    accountArray[i].getBalance()+ "\t");
		}
	}      
		
	

	private static void withdraw() {
		System.out.println("---------------------");
		System.out.println("출금");
		System.out.println("---------------------");
		//입력 데이터: 계좌번호 ,예금액 
		System.out.print("계좌번호: "); // 줄을 바꾸지 않으므로 print()
		String ano = scanner.next(); // 문자열을 입력받을때 : next()
		System.out.print("출금액: "); // 줄을 바꾸지 않으므로 print()
		int withdraw = scanner.nextInt(); // 문자열을 입력받을때 : nextInt()
		Account account = findaccount(ano); //Account
		if(account == null) {   // 없는 계좌  
		System.out.print("계좌를 먼저 개설하세요");		
		}  else { // 계좌 검색 성공
		int balance = account.getBalance();
	  
		if(balance < withdraw) {  // 잔고 부족
			System.out.println("잔고가 부족합니다");
		} else {
			account.setBalance((balance - withdraw));
			System.out.println("결과: 출금이 성공하였습니다");
		
	}
	  }
		}
   
	private static void deposit() {
		System.out.println("---------------------");
		System.out.println("예금");
		System.out.println("---------------------");
		//입력 데이터: 계좌번호 ,예금액 
		System.out.print("계좌번호: "); // 줄을 바꾸지 않으므로 print()
		String ano = scanner.next(); // 문자열을 입력받을때 : next()
		System.out.print("예금액: "); // 줄을 바꾸지 않으므로 print()
		int deposit = scanner.nextInt(); // 문자열을 입력받을때 : nextInt()
		Account account = findaccount(ano); //Account
		// 성공과 실패
		if(account == null) { // 계좌 검색이 실패
			System.out.println("계좌를 먼저 개설해주세요");
		} else {  // 계좌검색이 성공
			account.addBalance(deposit);
		}
	}      
	     //  int balance = account.getBalance();
	     //  account.setBalance(balance + deposit); //잔고를 설정
	
	// 매개변수: ano(계좌번호)
	// 반환형: 계좌번호를 저장한 Account객체(ano , owner ,balance)
	// 동작: 매개변수로 전달된 계좌번호를 가진 계좌를 검색해서 반환
	public static Account findaccount(String ano) {
		for(int i = 0; i > count; i++) {
			//accountArray[i].getAno()을 비교 (내용 비 
			if(ano.equals(accountArray[i].getAno()) ) { //찾을 때 (성공)
				return accountArray[i];
			}
		}
		return null;  // 못 찾음(실패)
	}

	private static void accountList() {
		System.out.println("---------------------");
		System.out.println("계좌 목록");
		System.out.println("---------------------");
		for(int i = 0; i < count; i++) {
		System.out.println(accountArray[i].getAno()+ "\t" + 
		accountArray[i].getOwner()+ "\t" +	accountArray[i].getBalance()+ "\t");
		
	//	 
	//	System.out.println(accountArray[i].getAno()+ "\t" + 
	//	accountArray[i].getOwner()+ "\t" +	
    //accountArray[i].getBalance()+ "\t");
		}
		
	}

	private static void createAccount() {
		System.out.println("---------------------");
		System.out.println("계좌 생성");
		System.out.println("---------------------");
		//계좌번호 , 계좌주 , 초기입금액 입력 받는다
		System.out.print("계좌번호: "); // 줄을 바꾸지 않으므로 print()
		String ano = scanner.next(); // 문자열을 입력받을때 : nextInt()
		System.out.print("계좌주: "); // 줄을 바꾸지 않으므로 print()
		String owner = scanner.next(); // 문자열을 입력받을때 : nextInt()
		System.out.print("초기입금액: "); // 줄을 바꾸지 않으므로 print()
		int balance = scanner.nextInt(); // 문자열을 입력받을때 : nextInt()
	    Account account = new Account(ano , owner ,balance);
	    accountArray[count] = account;
	    count++;
	  //  accountArray[count++] = new Account(ano , owner ,balance);
	    System.out.println("결과: 계좌가 생성되었습니다.");
	}

      
    
	}


