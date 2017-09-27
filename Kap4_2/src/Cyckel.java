
public class Cyckel extends Fordon implements IPrintable, IHjulburen {

	private int antalVäxlar;

	public Cyckel(int hastighet, int vikt, int antalVäxlar) {
		super(hastighet, vikt);
		this.antalVäxlar = antalVäxlar;
	}

	@Override
	public void printMe() {
		System.out.println("Antal växlar: " + antalVäxlar + ", vikt: " + vikt + ", hastighet: " + hastighet);

	}

	@Override
	public void getAntalHjul() {
		// TODO Auto-generated method stub
		
	}

}
