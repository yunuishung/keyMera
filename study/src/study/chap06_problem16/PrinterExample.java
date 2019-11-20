package study.chap06_problem16;

import static study.chap06_problem16.Printer.printer;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		Printer.printer(10);
		Printer.printer(true);
		printer(5.7);
		Printer.printer("홍길동");

	}

}
