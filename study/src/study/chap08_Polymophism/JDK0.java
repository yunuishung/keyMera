package study.chap08_Polymophism;

public class JDK0 {

	public static void main(String[] args) {
		String str1 = "JDK" + 8.0;
		String str2 = str1 + "특징";
		System.out.println(str2);

		String str3 = "JDK" + 4 + 4.0;
		String str4 = 4 + 4.0 +"JDK";
		String str5 = "Tomcat" + (4+ 4.0);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
