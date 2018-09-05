package ACM;

public class QuicklySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5, 3, 9, 6, 7 };
		int b[]= {0};
		int c[]= {1,2,3};
		sort(a);
		sort(b);
		sort(c);

	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = a.length - 1;
		quicklySort(a, left, right);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}

	private static void quicklySort(int[] a, int left,
			int right) {
		// TODO Auto-generated method stub
		if(left>=right) {return;}
		int mid = part(a, left, right);
		quicklySort(a, left, mid - 1);
		quicklySort(a, mid + 1, right);

	}

	private static int part(int[] a, int left, int right) {
		// TODO Auto-generated method stub
		int tem = left;
		while (left < right) {
			while ((left < right)&&a[tem]<=a[right]) {
				right--;
			}
			while (left < right&&a[tem]>=a[left]) {
				left++;
			}
			swap(a,right,left);
			
		}
		swap( a,tem,left);
		return left;
	}

	private static void swap(int[] a, int right, int left) {
		// TODO Auto-generated method stub
		int tem=a[right];
		a[right]=a[left];
		a[left]=tem;
	}

}
