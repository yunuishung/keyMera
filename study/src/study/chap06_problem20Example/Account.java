package study.chap06_problem20Example;

public class Account {
     private String ano;   // 다른 클래스에서 접근을 허용하지 않게 : private
     private String owner; //참조변수 , 필드명으로 접근 금지
      int balance;
      
      //생성자
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
    //Getter and Setter : 필드가 private이므로 직접 접근이 어렵고  getter and setter를 사용해서
	// 접근하도록 방법을 제공한다
	
	public String getAno() {
		return ano;
	}

	public int setAno(String ano) {
		if(ano.length() > 7) {
			System.out.println("7자리만 입력하세요");
		}else
		this.ano = ano;
		return 0;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}
    //BankApplication에서 입금(입금액), 출금(출금액)
	public void setBalance(int balance) {  // 음의 값이 저장되지 않도록 수정
		this.balance = balance;
	}
	public void addBalance(int deposit) { // 입금액
		balance += deposit; // 복합 대입 연산자를 사용해서 누적
	}
	 public int subtractBalance(int withdraw) { // 출금액
		 if(balance > withdraw) {
			 balance -= withdraw;
		  return 0;  // 출금이 성공하면 0을 반환     
	 
	 } else   {    // 잔고보다 더 많이 출금을 하려고 한다
		   return -1;
	 }
}

	 
}
