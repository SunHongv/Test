package FirstHeadDesign.Iterator;

public class ArrayIterator implements MyIterator{
	Menue[] menue;
	int position=0;
	public ArrayIterator(Menue[] meneu) {
		this.menue=menue;
	}
	

	@Override
	public Boolean hasNext() {
		// TODO Auto-generated method stub
		if(position<menue.length&&menue[position]!=null) {
			
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public Menue next() {
		return menue[position++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
