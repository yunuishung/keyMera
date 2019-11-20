package study.chap08_Interface_review;

import study.chap08_Ploblem04.OracleDB;

public class ClassA {
    OracleDB db = new OracleDB();
    
   

	public void ClassA(OracleDB oracle) {
    	 db = oracle;
    }
    
    public void insert() {
    	db.insert();
    }
    public void select() {
    	db.select();
    }
}
