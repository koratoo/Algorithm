
public class ���ڳ����Ա� {

	public static void main(String[] args) {
		//n��� 6�� �ּҰ����
		
		int a =6;
		int n =10;
		int max = 1;
		
			for(int i=1; i<=a && i<= n;i++) {
				if(a%i==0 && n%i==0) {
					max = i;
				}
			}
		
		int min = a*n/max;
		System.out.println(min);
	}
}
