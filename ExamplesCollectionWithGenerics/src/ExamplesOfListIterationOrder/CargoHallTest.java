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
		
		assertThat(cargohall, contains(klingonStrike,federationHope));
	}

	

}
