
public class Båt extends Fordon implements IPrintable {

	private int dödVikt;

	public Båt(int hastighet, int vikt, int dödVikt) {
		super(hastighet, vikt);
		this.dödVikt = dödVikt;
	}

	@Override
	public void printMe() {
		System.out.println("Dödvikten: " + dödVikt + ", vikt: " + vikt + ", hastighet: " + hastighet);

	}

}
