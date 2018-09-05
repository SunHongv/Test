package FirstHeadDesign.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Menue>list=new ArrayList<>();
		ListMenue lm=new ListMenue();
		ArrayMenue am=new ArrayMenue();
		MyIterator itr=lm.createIterator();
		MyIterator itr2=am.createIterator();
		while(itr.hasNext()) {
			Menue m=itr.next();
			list.add(m);
			
		}
		while(itr2.hasNext()) {
			Menue m=itr.next();
			list.add(m);
		}
		Iterator<Menue> Itr=list.iterator();
		while(Itr.hasNext()) {
			Menue m=Itr.next();
			System.out.println(m.name+":"+m.value);
		}
		
	}

}
