package study.chap06.class_review2;
  
public class CommonData {
	//1.
	private static final int MAX_MEMBER= 200;
	private static CommonData instance  = new CommonData();
    //2. 싱글톤
	private CommonData() {}
	//3. 
		public static CommonData getInstance() {
			return instance;
		
		
	}   //저장하고 싶은 데이터
		Member data[] = new Member[MAX_MEMBER]; //회원을 100명 저장
		public int count;
}
