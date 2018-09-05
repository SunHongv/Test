package FirstHeadDesign.Factory;

public class BeijingPizzStore extends PizzStore{

	@Override
	protected Pizz createPizz(String type) {
		// TODO Auto-generated method stub
		if(type=="chizz") {
		pizz=new BeijingChizzPizz();
		pizz.prepare();
		pizz.box();
		}else if(type=="cheese") {
			pizz=new BeijingCheesePizz();
		}
		return pizz;
	}

}
