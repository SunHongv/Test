package FirstHeadDesign.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ArrayMenue {
	
	Menue[] array=new Menue[6];
	public ArrayMenue() {
	for(int i=0;i<6;i++) {
		Menue menue=new Menue("menueArray"+i,i+"");
		array[i]=menue;	
	}	
	}
	public MyIterator createIterator(){
		return new ArrayIterator(array);
		
	}
}
