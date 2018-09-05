package FirstHeadDesign.Decoration;

public class Beer extends Drink {
	public Beer(Drink drink) {
		this.drink=drink;
		this.description="Beer";
		this.cost=15;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription()+description;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		
		return drink.cost()+this.cost;
	}

}
