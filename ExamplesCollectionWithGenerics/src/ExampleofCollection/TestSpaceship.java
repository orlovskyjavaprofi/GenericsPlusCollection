package ExampleofCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestSpaceship {

	public static void main(String[] args) {
		SpaceShip klingonStrike = new SpaceShip("Bar'ta", 5, 20, 50);
		SpaceShip federationHope = new SpaceShip("Voyager", 2, 5, 10);
		SpaceShip romulansCloak = new SpaceShip("Kerata", 6, 25, 100);
         
		Collection<SpaceShip> spaceships = new ArrayList<SpaceShip>(); //Java 6 Versions declaration
		addShipToTheCollection(klingonStrike, federationHope, romulansCloak, spaceships);		
		showTheListOfSpaceShips(spaceships);
	}

	public static void showTheListOfSpaceShips(Collection<SpaceShip> spaceships) {
		final Iterator<SpaceShip> spaceshipsIterator = spaceships.iterator();
		while(spaceshipsIterator.hasNext()){
			SpaceShip spaceship = spaceshipsIterator.next();
			
			if (spaceship.getNumberOfPhotonTorpedos() >50){
				System.out.print(spaceship);
				System.out.println("\n It's to many torpedos for one ship!");
				System.out.println("Removing the ship");
				spaceshipsIterator.remove();
			}else{
				System.out.println("This ship has enough photon torpedos!");
				System.out.print(spaceship);
			}
		}
		System.out.println("New list of ships: ");
		System.out.print(spaceships);
	}

	public static void addShipToTheCollection(SpaceShip klingonStrike, SpaceShip federationHope,
			SpaceShip romulansCloak, Collection<SpaceShip> spaceships) {
		spaceships.add(klingonStrike);
		spaceships.add(federationHope);
		spaceships.add(romulansCloak);
	}

}
