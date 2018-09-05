package ACM;
/*
 * 给定长度为N的字符串S,要构造一个长度为N的字符串T。起初，T是一个空串，随后反复进行下列任意操作。
 * 从S的头部删除一个字符，加到T的尾部。
 * 从S的尾部删除一个字符，加到T的尾部
 * 目标是要构造字典许尽可能小的字符串T。
 * N=6
 * s=“ACDBCB”
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
