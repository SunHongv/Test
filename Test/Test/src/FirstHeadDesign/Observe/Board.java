package FirstHeadDesign.Observe;

public class Board implements Observer{
	Subject sub;
	int tem;
	int hum;
	public Board(Subject sub) {
		// TODO Auto-generated constructor stub
		this.sub=sub;
		sub.addObserver(this);
	}
	
	
	private void display() {
		// TODO Auto-generated method stub
		System.out.println(tem+"  "+hum);
	}
	
	@Override
	public void update(int tem, int hum) {
		// TODO Auto-generated method stub
		this.tem=tem;
		this.hum=hum;
		display();
	}

}
