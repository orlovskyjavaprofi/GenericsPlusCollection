package ExamplesOfListIterationOrder;

import org.junit.Test;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import static Fixtures.SpaceshipsFixtures.*;

public class CargoHallTest {

	private Cargohall cargohall = new Cargohall();
	
	@Test
	public void addSpaceshipsToCargohall() throws Exception{
		cargohall.add(klingonStrike);
		cargohall.add(federationHope);
	
		
		assertThat(cargohall, contains(klingonStrike, federationHope));
	}
	
	@Test
	public void replaceSpaceships() throws Exception{
		cargohall.add(klingonStrike);
		cargohall.add(romulansCloak);
		
		cargohall.replace(federationHope, klingonStrike);
		
		assertThat(cargohall, contains(klingonStrike, romulansCloak));
	}

	@Test
	public void tryToReplaceMissingSpaceships() throws Exception
	{
		cargohall.add(romulansCloak);
		cargohall.replace(klingonStrike, federationHope);
		
		assertThat(cargohall, contains(romulansCloak));
	}
	

}
