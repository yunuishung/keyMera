package study.chap08_Interface_review;

import study.chap08_Ploblem04.OracleDB;

public class MainExample {

	public static void main(String[] args) {
		// 삽입 (insert) , 검색 (select)
		ClassA oracle = new ClassA (new OracleDB());
		oracle.insert();
	}

}
