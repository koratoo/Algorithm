
public class ġŲ���� {

	public static void main(String[] args) {
		int chicken = 1999;
		
		int answer = 0;
		int extra = 0;
		
		//�ֹ��� ġŲ �� ������ 10
		answer = chicken/10;
		
		//���ο� ����
		int newcoupon = answer;
		extra = chicken%10;
		newcoupon = extra + newcoupon;
		System.out.println(newcoupon);
		while(newcoupon>=10) {
			extra = newcoupon % 10; 
			newcoupon = newcoupon/10;
			
			answer+=newcoupon;
			
			newcoupon += extra;
			System.out.println(newcoupon);
			System.out.println(extra);
		}
		
		
		System.out.println(answer);
		
	}
}
