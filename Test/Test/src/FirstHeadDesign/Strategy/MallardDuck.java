package FirstHeadDesign.Strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		flyBehavoir=new FlyWithWings();
		quackBehavoir=new Squeak();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("MallarDuck");
		performFly();
		performQuack();
		
	}

}
