
public class TestProgram {

	public void printFordon(Fordon fordon) {
		fordon.printMe();
	}

	public void printStuff(IPrintable objName) {
		objName.printMe();
	}
	
	public void printaHjul(IHjulburen objName) {
		objName.getAntalHjul();
	}
	

	TestProgram() {

		Tåg tåg = new Tåg(200, 10000, 10, 40);
		Fordon tåg2 = new Tåg(500, 25000, 12, 50);
		Bil bil = new Bil(120, 900, 23, 4);
		Båt båt = new Båt(300, 850, 1);
		Cyckel cyckel = new Cyckel(50, 30, 12);

		printFordon(tåg);
		printFordon(tåg2);
		printFordon(bil);
		printFordon(cyckel);
		printFordon(båt);
		
		System.out.println();
		
		printStuff(cyckel);
		printStuff(båt);
		printStuff(bil);
		printStuff(tåg);
		printStuff(tåg2);
		
		System.out.println();
		
		bil.getAntalHjul();
		printaHjul(bil);
		printaHjul(tåg);
		//printaHjul(cyckel);		

	}

	public static void main(String[] args) {

		TestProgram s = new TestProgram();

	}

}
