package FirstHeadDesign.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMenue {
	List<Menue> list=new ArrayList<>();
	public ListMenue() {
		for(int i=0;i<6;i++) {
			Menue e=new Menue("MmenueList"+i,i+"");
			list.add(e);
			
		}
	
	}
	public MyIterator createIterator(){
		return new ListIterator(list);
		
	}

}
