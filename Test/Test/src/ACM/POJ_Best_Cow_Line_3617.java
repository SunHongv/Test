package ACM;
/*
 * ��������ΪN���ַ���S,Ҫ����һ������ΪN���ַ���T�������T��һ���մ�����󷴸������������������
 * ��S��ͷ��ɾ��һ���ַ����ӵ�T��β����
 * ��S��β��ɾ��һ���ַ����ӵ�T��β��
 * Ŀ����Ҫ�����ֵ�������С���ַ���T��
 * N=6
 * s=��ACDBCB��
 * */
public class POJ_Best_Cow_Line_3617 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=6;
		String S="ACDBCB";
		String T=null;
		
		solve(N,S);
		
	}

	private static void solve(int n, String s) {
		char[] chr=new char[s.length()];
		
		StringBuilder dis=new StringBuilder();
		s.getChars(0, n, chr, 0);
		System.out.println();
		int head=0;int tail=s.length()-1;
		boolean left=false;
		while(head<=tail) {
			for(int i=0;i+head<=tail;i++) {
				if(chr[i+head]<chr[tail-i]) {
					left=true;
					break;
				}else if(chr[i+head]>chr[tail-i]){
					left=false;
					break;
				}
			}
			if(left) {
				putchar(head,dis,chr);
				head++;
			}else {
				putchar(tail,dis,chr);
				tail--;
			}
		}
		System.out.println(dis);
	}

	private static void putchar(int head, StringBuilder dis,char[] chr) {
		// TODO Auto-generated method stub
		//dis+=chr[head];
		dis.append(chr[head]);
	}

}
