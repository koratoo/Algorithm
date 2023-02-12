
public class 이진수더하기 {

	public static void main(String[] args) {
		String bin1 = "10";
		String bin2 = "11";
		String answer ="";
		int a = Integer.valueOf(bin1,2);
		int b = Integer.valueOf(bin2,2);
		
		answer = Integer.toBinaryString(a+b);
		
		
	}
}
