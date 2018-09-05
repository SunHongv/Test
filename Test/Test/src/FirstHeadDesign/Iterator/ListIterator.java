package FirstHeadDesign.Iterator;

import java.util.List;

public class ListIterator implements MyIterator{

	List<Menue> menue;
	public ListIterator(List<Menue> list) {
		this.menue=list;
	}
	@Override
	public Boolean hasNext() {
		// TODO Auto-generated method stub
		return menue.iterator().hasNext();
	}

	@Override
	public Menue next() {
		// TODO Auto-generated method stub
	return	menue.iterator().next();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		menue.iterator().remove();
	}

}
