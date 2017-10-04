
public class Snake extends Animal{
	
	protected final double SFOOD = 20;  //Ska alltid ha 20g mat
	
	public Snake(String name, double weight, String race) {
		super(name, weight, race);	
	}
	
	@Override
	public String toString() {
		return getName() + " ska ha " + SFOOD + "g " + getRace() + "mat.";
	}

}
