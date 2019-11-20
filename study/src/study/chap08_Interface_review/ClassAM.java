package study.chap08_Interface_review;

public class ClassAM {
   MariaDB db = new MariaDB();
    
   



	

	public void ClassAM(MariaDB Maria) {
    	 db = Maria;
    }
    
    public void insert() {
    	db.insert();
    }
    public void select() {
    	db.select();
    }
}
