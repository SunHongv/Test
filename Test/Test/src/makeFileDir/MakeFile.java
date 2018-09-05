package makeFileDir;

import java.io.File;

public class MakeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="E:\\Daily\\2018_9";
		for(int i=1;i<=31;i++) {
			File f = new File(path,"2018_9_"+i) ;// 实例化File类的对象
			 if(f.exists()) {
		          // 文件已经存在，输出文件的相关信息
		            System.out.println(f.getAbsolutePath());
		            System.out.println(f.getName());
		            System.out.println(f.length());
		        } else {
		          //  先创建文件所在的目录
		        	f.mkdir() ;	// 创建文件夹
		           
		        }
			
			
		}
		
		
	}

}
