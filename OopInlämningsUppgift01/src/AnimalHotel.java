import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AnimalHotel {

	AnimalHotel() {

		Dog d1 = new Dog("Sixten", 5, "Hund");    //Skapar objekten med djuren
		Dog d2 = new Dog("Dogge", 10, "Hund");
		Cat c1 = new Cat("Venus", 5, "Katt");
		Cat c2 = new Cat("Ove", 3, "Katt");
		Snake s1 = new Snake("Hypno", 1, "Orm");
		
		List<Animal> animalList = new ArrayList<>();  //Skapar en lista med alla djur.
		animalList.add(d1);
		animalList.add(d2);
		animalList.add(c1);
		animalList.add(c2);
		animalList.add(s1);

		boolean bool = true;  //boolean för while
		int o = 1;			  //används i for loopen för att visa en siffra
		int choice = 0;		  //används i switch-menyn

		String message = "Djur Hotellet \n" + "Ange siffran på det djur du vill ge mat: \n";
		for (Animal x : animalList) {   //Loopar igenom listan och skriver ut namn + ras samt en siffra som ökas med 1 för varje varv (från 1).
			message += "\n" + o + ":   Namn: " + x.getName() + ", Ras: " + x.getRace();
			o++;
		}
		String input = JOptionPane.showInputDialog(null, message);  //Sparar användarens val som input.

		while (bool) {
			if (input == null || input == "")  //avslutar programmet om man trycker på kryss eller avbryt.
				System.exit(0);
			try {				//Testar så att användaren anger en siffra.
				choice = Integer.parseInt(input);   //gör om input till en int
				bool = false;						//Avslutar while-loopen
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "fel, du måste ange en siffra 1 till 5");
				bool = false;
			}
		}
		switch (choice) {  //Switch meny som printar ut hur mycket mat varje alternativ ska ha.
		case 1:
			JOptionPane.showMessageDialog(null, d1.calculateFood());  //Anropar metoden calculateFood.
			break;
		case 2:
			JOptionPane.showMessageDialog(null, d2.calculateFood());
			break;
		case 3:
			JOptionPane.showMessageDialog(null, c1.calculateFood());
			break;
		case 4:
			JOptionPane.showMessageDialog(null, c2.calculateFood());
			break;
		case 5:
			JOptionPane.showMessageDialog(null, s1.toString());
			break;
		case 6: // Polymorphing och dynamisk bindning
			Animal a = new Dog("Doggo the dog", 20, "Hund");
			Animal b = new Cat("Kitto the cat", 15, "Katt");
			Animal c = new Snake("Snakey the snake", 5, "Orm");
			//Animal x = new Animal();  //Går ej, klassen är abstract!
			a.setWeight(50); // ärvs från Animal
			b.setWeight(100);
			Dog d = new Dog("TheBetterDoggo the Dog", 10, "hund");
			d.setWeight(55);
			JOptionPane.showMessageDialog(null, a.toString());
			JOptionPane.showMessageDialog(null, b.toString());
			JOptionPane.showMessageDialog(null, c.toString());
			JOptionPane.showMessageDialog(null, d.toString());
			break;
		default:
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		AnimalHotel s = new AnimalHotel();

	}
}
