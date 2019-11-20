package study;

public class Arithmatic {

	public static void main(String[] args) {
	    int num =0x0011;
	    num = 0xF0000000;
	    int sNum= num <<  2; // 왼쪽으로 2비트 이동(4배)
	    int rNum = num >> 2; //오른쪽으로 2비트 이동(1/4)
	    int threeShift = num >>> 2; //오른쪽으로  2비트 이동
	    System.out.printf("num= %x\n", num); 
	    System.out.printf("sNum= %x\n", sNum);
	    System.out.printf("rNum= %x\n", rNum);
	    System.out.printf("threeShift= %x\n", threeShift);
	    // 부호비트가 1이 되게

	}

}
