package ACM;
/*
 * ��ǩ
 * ��д�����ֵ�n��ֽƬ����ڴ��У�����Դӿڴ��г�ȡ4��ֽƬ��ÿ�μ���ֽƬ�ϵ����ֺ󶼽���Żؿڴ��С�
 * �����4�����ֵĺ���m,������Ӯ���������������Ӯ����
 *��дһ�������жϵ�ֽƬ����д��������k1,k2...knʱ���Ƿ���ڳ�ȡ4�κ�Ϊm�ķ��������������YES,�������NO
 * */
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,m=9; //n��ֽƬ����Ϊm
		int[] k= {1,3,5,4};//�ڴ�������
		solve(n,m,k);

	}

	private static void solve(int n, int m, int[] k) {
		// TODO Auto-generated method stub
		int[] nn=new int[n*n];
		sort(nn,k);
		boolean f=false;
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
			if(	search(m-k[i]-k[j],nn)) {
				f=true;				
				
			break;
			}
			
			}
			if(f) {
				break;
			}
		}
		if(f) {
			System.out.println("Yes");
		}else {
			System.out.println("NO");
		}

	}

	private static boolean search(int i,int[] nn) {
		// TODO Auto-generated method stub
		int left=0;int right=nn.length-1;
		int  mid=0;
		boolean f=false;
		while(left<=right) {
			mid=(left+right)/2;
			if(nn[mid]==i) {
				f=true;
				//System.out.println("YES");
				break;
				
			}else if(nn[mid]<i) {
				left=mid+1;
				
			}else {
				right=mid-1;
			}
			
		}
		if(f) {
			return true;
			
		}else {

return false;
		}
	}

	private static void sort(int[] nn,int[] k) {
		// TODO Auto-generated method stub
		for(int i=0;i<k.length;i++) {
			for(int j=0;j<k.length;j++) {
				nn[i*k.length+j]=k[i]+k[j];			
			}			
		}
		quicklySort(nn,nn.length);		
		
	}

	private static void quicklySort(int[] nn, int length) {
		// TODO Auto-generated method stub
		int left=0,right=length-1;
		sortCore(nn,left,right);
		
	}

	private static void sortCore(int[] nn, int left,
			int right) {
		// TODO Auto-generated method stub
		
		int pos=parten(nn,left,right);
		if(pos>-1) {sortCore(nn,left,pos-1);//�ж�pos 2 4 6 4 6 8 8 10  ������� ����  �ߵ�0λ��ʱ��������ѭ��
		sortCore(nn,pos+1,right);
		}
		
		
		
	}

	private static int parten(int[] nn, int left,
			int right) {
		// TODO Auto-generated method stub
		if(left>=right) {return -1;}
		int tem=nn[left];
		while(left<right) {
			while(left<right&&nn[right]>=tem) {//right-- ����ǰ ��ѡ��temΪ��һ����ʱ�򣬷��򣬻���뵽��ѭ�� �� 2 4 6 4 6 8 8 10 �������
				right--;
			}
			while(left<right&&tem>=nn[left]) {
				left++;
			}
			
			
			swap(nn,left,right);
			
		}
		int tem1=nn[left];
		tem=tem1;
		nn[left]=tem;
		
		return left;
	}

	private static void swap(int[] nn,int i, int j) {
		// TODO Auto-generated method stub
		int tem=nn[i];
		nn[i]=nn[j];
		nn[j]=tem;
	}

}
