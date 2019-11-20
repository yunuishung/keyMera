package study.chap06_problem18;

public class ShopService {
    //싱글톤 만드는 방법
	private static ShopService instance = new ShopService () {
		//생성자
		private ShopService() { }
		//Getter
		 public static ShopService getInstance() {
			 return instence;
		 }
		
	
}