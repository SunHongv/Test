package ACM;
/*
 * 有1元 5元 10元 50元 100元 500元的硬币各C1 C5 C10 C50 C100 C500枚 现再要用这些硬币来支付A元，最少需要多少枚硬币？
 * 假定本体至少存在一种支付方案。
 * 0<=C1..C500<10^9
 * 0<=A<=10^9
 * 贪心算法实现
 * */
public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin= {1,5,10,50,10,500};
		int[] C= {3,2,1,3,0,2,};
		int A=620;
		//下面是sovle
		int ans=0;
		for(int i=5;i>=0;i--) {
			int t=Math.min(A/coin[i], C[i]);
			ans+=t;
			A-=t*coin[i];
			
		}
		System.out.println(ans);
		
	}

}
