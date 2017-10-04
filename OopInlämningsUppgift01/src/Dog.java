
public class Dog extends Animal implements ICalculateFood {

	protected double food;

	public Dog(String name, double weight, String race) {
		super(name, weight, race);
	}

	public String calculateFood() {
		food = (getWeight() * 1000) / 100;
		return getName() + " ska ha " + food + "g " + getRace() + "mat.";
	}

	@Override
	public String toString() {
		return "Namn: " + getName() + ", vikt: " + getWeight() + ", Ras: " + getRace();
	}

}
