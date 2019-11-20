package study.chap08_Interface_review_Interface;

public class MariaDB implements IDatabase {
	//메소드 : CRUD
	@Override
		public void insert() {
			System.out.println("MariaDB:insert()가 호출됨");
		}
	@Override
		public void select() {
			System.out.println("MariaDB:select()가 호출됨");
		}
	@Override
	public void insert(String sql) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void select(String sq1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(int balance) {
		// TODO Auto-generated method stub
		
	}
}
