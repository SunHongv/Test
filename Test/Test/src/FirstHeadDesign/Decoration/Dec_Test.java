package FirstHeadDesign.Decoration;

public class Dec_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Water water=new Water();
		Coffe coffe=new Coffe(water);
		Beer beer=new Beer(water);
		coffe=new Coffe(beer);
		
		System.out.println(beer.getDescription()+beer.cost());
		System.out.println(coffe.getDescription()+coffe.cost());

	}

}
