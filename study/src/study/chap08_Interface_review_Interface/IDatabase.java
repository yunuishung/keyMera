package study.chap08_Interface_review_Interface;

public interface IDatabase {
	// 추상메소드
	// 추상메소드
	void insert(String sql);
    void select(String sq1);
	//새로운 추가
   void update(int balance);
    default void update1(int balance) {
     System.out.println("update()가 호출됨"); 
            }
	void insert();
	void select();
}
