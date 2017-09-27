
public class Tåg extends Fordon implements IPrintable, IHjulburen {

	private int antalVagnar;
	private int antalHjul;

	// Konstruktor
	public Tåg(int hastighet, int vikt, int antalVagnar, int antalHjul) {
		super(hastighet, vikt);
		this.antalVagnar = antalVagnar;
		this.antalHjul = antalHjul;
	}

	public void kopplaVagn() {
	}

	@Override
	public void printMe() {
		System.out.println("Antal Vagnar: " + antalVagnar + ", vikt: " + vikt + ", hastighet: " + hastighet
				+ ", Antal Hjul: " + antalHjul);

	}

	@Override
	public void getAntalHjul() {
		System.out.println(antalHjul);

	}

}
