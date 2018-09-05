package FirstHeadDesign.Decoration;

public class Coffe extends Drink{

	
	public Coffe(Drink drink) {
		this.drink=drink;
		this.description="Coffe";
		this.cost=20;
		
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return drink.getDescription()+description;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.cost+drink.cost();
	}

}
