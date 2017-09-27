
public class Bil extends Fordon implements IPrintable, IHjulburen {

	private int motorEffekt;
	private int antalHjul;

	public Bil(int hastighet, int vikt, int motorEffekt, int antalHjul) {
		super(hastighet, vikt);
		this.motorEffekt = motorEffekt;
		this.antalHjul = antalHjul;
	}

	public void växla() {

	}

	@Override
	public void printMe() {
		System.out.println("Motoreffekten: " + motorEffekt + ", vikt: " + vikt + ", hastighet: " 
										+ hastighet + ", Antal Hjul: " + antalHjul);

	}

	@Override
	public void getAntalHjul() {
		System.out.println(antalHjul);
	}
}
