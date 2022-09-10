package mypackage;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("Looks like a decoy duck");
	}
}
