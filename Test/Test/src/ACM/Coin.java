package ACM;
/*
 * ��1Ԫ 5Ԫ 10Ԫ 50Ԫ 100Ԫ 500Ԫ��Ӳ�Ҹ�C1 C5 C10 C50 C100 C500ö ����Ҫ����ЩӲ����֧��AԪ��������Ҫ����öӲ�ң�
 * �ٶ��������ٴ���һ��֧��������
 * 0<=C1..C500<10^9
 * 0<=A<=10^9
 * ̰���㷨ʵ��
 * */
public class Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin= {1,5,10,50,10,500};
		int[] C= {3,2,1,3,0,2,};
		int A=620;
		//������sovle
		int ans=0;
		for(int i=5;i>=0;i--) {
			int t=Math.min(A/coin[i], C[i]);
			ans+=t;
			A-=t*coin[i];
			
		}
		System.out.println(ans);
		
	}

}
