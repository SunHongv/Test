package ACM;
/*
 * ֱ������N���㡣��i��λ����Xi.����N������ѡ�����ɸ��������Ǽ��ϱ�ǡ���ÿһ���㣬�����ΪR���ڵ�����������б�ǵĵ㣨�Լ�������б�ǵĵ�
 * ��������Ϊ�������Ϊ0�ĵط���һ����ǵĵ㣩���������������������£�ϣ����Ϊ�������ٵĵ���ӱ�ǡ���������Ҫ�ж��ٸ���
 * �����ϱ�ǡ�
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
		int p=0;//��ʼλ��
		int i=0;//�ƶ�λ��
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
