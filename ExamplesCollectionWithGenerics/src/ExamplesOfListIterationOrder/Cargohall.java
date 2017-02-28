package ExamplesOfListIterationOrder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cargohall implements Iterable<Spaceship>{

	private static final int MAX_AMOUNT_OF_PHOTON_TORPEDOS = 50; 
    public static final int SPACESHIP_NOT_PRESENT = -1;
    
    private final List<Spaceship> spaceships = new ArrayList<Spaceship>();
	
	public void add(Spaceship spaceship) {
		spaceships.add(spaceship);
	}
	
	  public void replace(Spaceship originalSpaceship, Spaceship newSpaceship)
	    {
	        final int index = spaceships.indexOf(originalSpaceship);
	        if (index != SPACESHIP_NOT_PRESENT)
	        {
	            spaceships.set(index, newSpaceship);
	        }
	    }
	

	@Override
	public Iterator<Spaceship> iterator() {
	
		return spaceships.iterator();
	}

	
}
