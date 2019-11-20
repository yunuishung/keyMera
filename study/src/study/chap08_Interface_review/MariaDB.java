package study.chap08_Interface_review;

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
}
