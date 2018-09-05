package ACM;

/*挑战程序设计竞赛P18
 * n只蚂蚁以每秒1cm的速度在长为Lcm的杆子上爬行。当蚂蚁爬到杆子的端点时就会掉落。
 * 由于杆子太细，蚂蚁相遇无法交错通过，只能各自反向爬回去。对于每只蚂蚁，
 * 我们知道它距离杆子左端的距离是xi,但不知道它当前的朝向。请计算所有蚂蚁落下杆子所需要的最短时间和最长时间。
 * 
 * */
public class POJ_Ants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L = 10;//杆子长度
		int n = 3;//n只蚂蚁
		int[] x = { 2, 6, 7 };//蚂蚁距离左端的距离
		sovle(L,n,x);
	}

	private static void sovle(int l, int n, int[] x) {
		// TODO Auto-generated method stub
		int max=0;
		int min=0;
		for(int i=0;i<x.length;i++)
		{
			max=Math.max(max, Math.max(l-x[i], x[i]));
			min=Math.max(min, Math.min(l-x[i], x[i]));
			
		}
		
		System.out.printf("Max:%d,Min:%d\n",max,min);
		
		
	}

}
