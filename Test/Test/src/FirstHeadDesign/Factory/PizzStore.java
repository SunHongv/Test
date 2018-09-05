package FirstHeadDesign.Factory;

public abstract class PizzStore {
	protected abstract Pizz createPizz(String type);
	Pizz pizz=null;
	public Pizz OderPizz(String type) {
		pizz=createPizz(type);
		pizz.prepare();
		pizz.box();
		return pizz;
	}

}
