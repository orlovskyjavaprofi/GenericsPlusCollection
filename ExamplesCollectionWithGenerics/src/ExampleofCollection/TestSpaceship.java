package ExampleofCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import ExamplesOfListIterationOrder.Spaceship;

public class TestSpaceship {

	public static void main(String[] args) {
		Spaceship klingonStrike = new Spaceship("Bar'ta", 5, 20, 50);
		Spaceship federationHope = new Spaceship("Voyager", 2, 5, 10);
		Spaceship romulansCloak = new Spaceship("Kerata", 6, 25, 100);
         
		Collection<Spaceship> spaceships = new ArrayList<Spaceship>(); //Java 6 Versions declaration
		addShipToTheCollection(klingonStrike, federationHope, romulansCloak, spaceships);		
		showTheListOfSpaceShips(spaceships);
		System.out.println("\nCurrently in hangar are " + spaceships.size()+" spaceships available");
	}

	public static void showTheListOfSpaceShips(Collection<Spaceship> spaceships) {
		final Iterator<Spaceship> spaceshipsIterator = spaceships.iterator();
		while(spaceshipsIterator.hasNext()){
			Spaceship spaceship = spaceshipsIterator.next();
			checkremoveAmountOfPhotonTorpedos(spaceshipsIterator, spaceship);
		}
		System.out.println("new list of ships: ");
		System.out.print(spaceships);
	}

	public static void checkremoveAmountOfPhotonTorpedos(final Iterator<Spaceship> spaceshipsIterator,
			Spaceship spaceship) {
		if (spaceship.getNumberOfPhotonTorpedos() >50){
			System.out.print(spaceship);
			System.out.println("\n It's to many torpedos for one ship! ");
			System.out.print("\nRemoving the ship and show the ");
			spaceshipsIterator.remove();
		}else{
			System.out.println("\nThis ships has enough photon torpedos!");
			System.out.println("====================================================================================");
			System.out.print(spaceship);
		}
	}

	public static void addShipToTheCollection(Spaceship klingonStrike, Spaceship federationHope,
			Spaceship romulansCloak, Collection<Spaceship> spaceships) {
		spaceships.add(klingonStrike);
		spaceships.add(federationHope);
		spaceships.add(romulansCloak);
	}

}
