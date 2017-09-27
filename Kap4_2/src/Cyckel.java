
public class Cyckel extends Fordon implements IPrintable, IHjulburen {

	private int antalV�xlar;

	public Cyckel(int hastighet, int vikt, int antalV�xlar) {
		super(hastighet, vikt);
		this.antalV�xlar = antalV�xlar;
	}

	@Override
	public void printMe() {
		System.out.println("Antal v�xlar: " + antalV�xlar + ", vikt: " + vikt + ", hastighet: " + hastighet);

	}

	@Override
	public void getAntalHjul() {
		// TODO Auto-generated method stub
		
	}

}
