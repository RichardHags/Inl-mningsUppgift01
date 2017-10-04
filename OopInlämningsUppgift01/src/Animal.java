//Superklass
abstract class Animal {

	private String name;       //Inkapsling, privata variabler som bara kan användas i den här klassen
	private double weight;	   //andra subklasser kan nå dem genom att kalla på get/set metoderna.
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

	public void setWeight(double weight) {   //Så man kan ändra vikten. 
		this.weight = weight;				
	}

	public String toString() {
		return "Namn: " + name + ", vikt: " + weight + ", Ras: " + race;
	}

}
