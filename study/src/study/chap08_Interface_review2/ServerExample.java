package study.chap08_Interface_review2;

public class ServerExample {

	private static OracleDB classA;
	private static OracleDB classB;
	private static OracleDB classC;

	public static void main(String[] args) {
		ClassA.classA = new ClassA(new OracleDB);
		classA.insert();
		classA.select();
		ClassB.classB = new ClassB(new MariaDB);
		classB.insert();
		classB.select();
		ClassC.classC = new ClassC(new MsqlDB);
		classC.insert();
		classC.select();

	}

}
