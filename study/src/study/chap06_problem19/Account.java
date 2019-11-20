package study.chap06_problem19;

public class Account {
    //상수 : static final
	
	//필드
    private int balance;   //public , protected , default , private 


	
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    //Getter and  Setter
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		// 매개값 balance가 0보다 작거나 1000000보다 크면 현재값 유지
		//(this.balance)을 유지
		//if(!(balance < || 0 && balance > 1000000 ))
		//if(!(balance < 0) !(||) && !(balance > 1000000 ))
		if(balance >= 0 && balance <= 1000000 )
		this.balance = balance;
	}
   
}