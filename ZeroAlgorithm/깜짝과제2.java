/*
  김지성 수강생
  깜짝과제 2번
  2300606 작성
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 깜짝과제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		System.out.println("내 좌표 x값을 입력해 주세요.");
		int myX = sc.nextInt();
		System.out.println("내 좌표 y값을 입력해 주세요.");
		int myY = sc.nextInt();
		List<Point> list = new ArrayList<>();
		boolean pointExist = false;
		while(cnt!=11) {
			pointExist =false;
			System.out.println(cnt+"/10 번째 입력");
			System.out.println("임의의 좌표 x값을 입력해 주세요.");
			int x = sc.nextInt();
			System.out.println("임의의 좌표 y값을 입력해 주세요.");
			int y = sc.nextInt();
			
			//자신의 좌표와 동일한지 화인
			if(x==myX && y == myY) {
				System.out.println("자신의 좌표와 동일합니다. 다시 입력해주세요!");
				continue;
			}
			//이미 존재하는 좌표인지 검증
			for(int i=0;i<list.size();i++) {
				if(list.get(i).x == x && list.get(i).y == y) {
					System.out.println("이미 존재하는 좌표입니다. 다시 입력해주세요");
					pointExist = true;
					break;
				}
			}
			if(pointExist==false) {
				list.add(new Point(x,y));
				cnt++;
			}
		}//while end
		
		double max = Integer.MAX_VALUE;
		int shortestX = 0;
		int shortestY = 0;
		
		for(int i=0;i<list.size();i++) {
			int x = list.get(i).x;
			int y = list.get(i).y;
			double dist = Math.sqrt(Math.pow(Math.abs(myX-x), 2) + Math.pow(Math.abs(myY-y), 2));
			System.out.print("("+x+","+y+")=>" );
			System.out.printf("%.6f\n",dist);
			if(max>dist) {
				max = dist;
				shortestX = x;
				shortestY = y;
			}
		}
		System.out.println("제일 가까운 좌표:");
		System.out.printf("(%d, %d) => %.6f",shortestX,shortestY,max);
	}
}
class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
