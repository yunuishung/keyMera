package study.chap06.singleton;

public class CommonStorage {
       private static CommonStorage in = new CommonStorage();
       private CommonStorage() { }
       public static CommonStorage getIn() {
    	   return in;
       }
       int data = 10;
}
