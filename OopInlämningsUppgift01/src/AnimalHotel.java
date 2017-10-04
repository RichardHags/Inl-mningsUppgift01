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

		boolean bool = true;  //boolean f�r while
		int o = 1;			  //anv�nds i for loopen f�r att visa en siffra
		int choice = 0;		  //anv�nds i switch-menyn

		String message = "Djur Hotellet \n" + "Ange siffran p� det djur du vill ge mat: \n";
		for (Animal x : animalList) {   //Loopar igenom listan och skriver ut namn + ras samt en siffra som �kas med 1 f�r varje varv (fr�n 1).
			message += "\n" + o + ":   Namn: " + x.getName() + ", Ras: " + x.getRace();
			o++;
		}
		String input = JOptionPane.showInputDialog(null, message);  //Sparar anv�ndarens val som input.

		while (bool) {
			if (input == null || input == "")  //avslutar programmet om man trycker p� kryss eller avbryt.
				System.exit(0);
			try {				//Testar s� att anv�ndaren anger en siffra.
				choice = Integer.parseInt(input);   //g�r om input till en int
				bool = false;						//Avslutar while-loopen
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "fel, du m�ste ange en siffra 1 till 5");
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
			//Animal x = new Animal();  //G�r ej, klassen �r abstract!
			a.setWeight(50); // �rvs fr�n Animal
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
