
public class B�t extends Fordon implements IPrintable {

	private int d�dVikt;

	public B�t(int hastighet, int vikt, int d�dVikt) {
		super(hastighet, vikt);
		this.d�dVikt = d�dVikt;
	}

	@Override
	public void printMe() {
		System.out.println("D�dvikten: " + d�dVikt + ", vikt: " + vikt + ", hastighet: " + hastighet);

	}

}
