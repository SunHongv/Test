package ACM;

/*��ս������ƾ���P18
 * nֻ������ÿ��1cm���ٶ��ڳ�ΪLcm�ĸ��������С��������������ӵĶ˵�ʱ�ͻ���䡣
 * ���ڸ���̫ϸ�����������޷�����ͨ����ֻ�ܸ��Է�������ȥ������ÿֻ���ϣ�
 * ����֪�������������˵ľ�����xi,����֪������ǰ�ĳ�������������������¸�������Ҫ�����ʱ����ʱ�䡣
 * 
 * */
public class POJ_Ants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int L = 10;//���ӳ���
		int n = 3;//nֻ����
		int[] x = { 2, 6, 7 };//���Ͼ�����˵ľ���
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
