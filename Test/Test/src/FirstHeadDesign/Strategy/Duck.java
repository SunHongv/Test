package FirstHeadDesign.Strategy;

public abstract class Duck {
	FlyBehavior flyBehavoir;
	QuackBehavior quackBehavoir;
	public Duck() {
		
	}
	public abstract void display();
	public  void performQuack() {
		quackBehavoir.quack();
	};
	public  void performFly() {
		flyBehavoir.fly();
	};
	
	public  void swim() {
		System.out.println("Swim all");
		
	};
	
	public  void setFlyBehavoir(FlyBehavior fly) {
		flyBehavoir=fly;
	};
	public  void setQuackBehavoir(QuackBehavior quack) {
		quackBehavoir=quack;
	};
}
