
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

		T�g t�g = new T�g(200, 10000, 10, 40);
		Fordon t�g2 = new T�g(500, 25000, 12, 50);
		Bil bil = new Bil(120, 900, 23, 4);
		B�t b�t = new B�t(300, 850, 1);
		Cyckel cyckel = new Cyckel(50, 30, 12);

		printFordon(t�g);
		printFordon(t�g2);
		printFordon(bil);
		printFordon(cyckel);
		printFordon(b�t);
		
		System.out.println();
		
		printStuff(cyckel);
		printStuff(b�t);
		printStuff(bil);
		printStuff(t�g);
		printStuff(t�g2);
		
		System.out.println();
		
		bil.getAntalHjul();
		printaHjul(bil);
		printaHjul(t�g);
		//printaHjul(cyckel);		

	}

	public static void main(String[] args) {

		TestProgram s = new TestProgram();

	}

}
