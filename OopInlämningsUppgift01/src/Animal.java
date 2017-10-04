//Superklass
abstract class Animal {

	private String name;       //Inkapsling, privata variabler som bara kan anv�ndas i den h�r klassen
	private double weight;	   //andra subklasser kan n� dem genom att kalla p� get/set metoderna.
	private String race;	
	
	public Animal() {}  

	public Animal(String name, double weight, String race) {
		this.name = name;
		this.weight = weight;
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public String getRace() {
		return race;
	}

	public void setWeight(double weight) {   //S� man kan �ndra vikten. 
		this.weight = weight;				
	}

	public String toString() {
		return "Namn: " + name + ", vikt: " + weight + ", Ras: " + race;
	}

}
