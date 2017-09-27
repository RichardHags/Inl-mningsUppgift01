
public abstract class Fordon implements IPrintable {

	protected int vikt;
	protected int hastighet;
	


	Fordon(int hastighet, int vikt) {
		this.hastighet = hastighet;
		this.vikt = vikt;
		
	}

	public int getHastighet() {
		return hastighet;
	}

	public int getVikt() {
		return vikt;
	}

	public void changeSpeed(int newSpeed) {
		hastighet = newSpeed;
	}

	abstract public void printMe(); // Mall för vad som behövs i superklassen, annars kan inte den här klassen
									// användas
}
