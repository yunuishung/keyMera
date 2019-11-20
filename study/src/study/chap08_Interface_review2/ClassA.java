package study.chap08_Interface_review2;

import study.chap08_Interface_review.IDatabase;
import study.chap08_Ploblem04.OracleDB;

public class ClassA {

	IDatabase db; //인터페이스 필드
	public ClassA(OracleDB oracleDB) {
		OracleDB db = new OracleDB();	    

		public void ClassA(OracleDB oracle); {
	    	 db = oracle;
	    }
	    
	    public void insert(); {
	    	db.insert();
	    }
	    public void select(); {
	    	db.select();
	    }
	}
	private void select() {
		db.insert();
		
	}
	private void insert() {
		db.select();
		
	}

	
}
