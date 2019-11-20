package study.chap06_problem19;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
				
		account.setBalance(20000000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(30000000);
		System.out.println("현재 잔고: " + account.getBalance());
	}
	
	

}
