package ACM;
/*
 * 直线上有N个点。点i的位置是Xi.从这N个点钟选择若干个，给他们加上标记。对每一个点，其距离为R以内的区域里必须有标记的点（自己本身带有标记的点
 * ，可以认为与其距离为0的地方有一个标记的点）。在满足这个条件的情况下，希望能为尽可能少的点添加标记。请问至少要有多少个点
 * 被加上标记。
 * */
public class POJ_Sarumans_Army_3069 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=6;
		int R=10;
		int[] X= {1,7,20,30,50,70};
		int[] Y= {50,30,20,15,7,1};
		int[] Z= {15,1,7,20,30,50};
		solve(N,R,X);
	}

	private static void solve(int n, int r, int[] x) {
		// TODO Auto-generated method stub
		int p=0;//开始位置
		int i=0;//移动位置
		int count=0;
		while(i<n) {
			while((i<n)&&(x[p]+r)>=(x[i]-x[p])) {
				i++;
			}
			count++;
			
			p=i-1;	
			System.out.println(p);
		}
		System.out.println(count);
		
	}

}
