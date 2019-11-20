package study.chap08_Interface_review2;

import study.chap08_Interface_review_Interface.IDatabase;

public class MariaDB implements IDatabase {
	
	@Override
		public void insert() {
			System.out.println("MariaDB:insert()가 호출됨");
		}
	@Override
		public void select() {
			System.out.println("MariaDB:select()가 호출됨");
		}
}
