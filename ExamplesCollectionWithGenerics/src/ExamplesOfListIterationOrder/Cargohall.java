package ExamplesOfListIterationOrder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cargohall implements Iterable<Spaceship>{

    private final List<Spaceship> spaceships = new ArrayList<Spaceship>();
	
	public void add(Spaceship spaceship) {
		spaceships.add(spaceship);
		
	}

	@Override
	public Iterator<Spaceship> iterator() {
	
		return spaceships.iterator();
	}

}
