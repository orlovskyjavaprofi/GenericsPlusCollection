package ExampleofCollection;

public class SpaceShip {

	private String spaceShipName;
	private int numberOfEngines;
	private int numberOfPlasmaWeapons;
	private int numberOfPhotonTorpedos;

	public SpaceShip(String spaceShipName, int numberOfEngines, int numberOfPlasmaWeapons, int numberOfPhotonTorpedos) {

		this.spaceShipName = spaceShipName;
		this.numberOfEngines = numberOfEngines;
		this.numberOfPlasmaWeapons = numberOfPlasmaWeapons;
		this.numberOfPhotonTorpedos = numberOfPhotonTorpedos;
	}

	public String getSpaceShipName() {
		return spaceShipName;
	}

	public void setSpaceShipName(String spaceShipName) {
		this.spaceShipName = spaceShipName;
	}

	public int getNumberOfEngines() {
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines) {
		this.numberOfEngines = numberOfEngines;
	}

	public int getNumberOfPlasmaWeapons() {
		return numberOfPlasmaWeapons;
	}

	public void setNumberOfPlasmaWeapons(int numberOfPlasmaWeapons) {
		this.numberOfPlasmaWeapons = numberOfPlasmaWeapons;
	}

	public int getNumberOfPhotonTorpedos() {
		return numberOfPhotonTorpedos;
	}

	public void setNumberOfPhotonTorpedos(int numberOfPhotonTorpedos) {
		this.numberOfPhotonTorpedos = numberOfPhotonTorpedos;
	}
	
	@Override
	public String toString(){
	   String result = getPropertiesOfSpaceShip();
	   
	   return result;
	}

	public String getPropertiesOfSpaceShip() {
		String spaceShipName = this.getSpaceShipName();
		   int numberOfEngines = this.getNumberOfEngines();
		   int numberOfPlasmaWeapons = this.getNumberOfPlasmaWeapons();
		   int numberOfPhotonTorpedos = this.getNumberOfPhotonTorpedos();
			
		   String result = "\n Spaceship name: "+ spaceShipName+ "\n Number of engines: "+numberOfEngines+
				            "\n Number of plasma weapons: "+numberOfPlasmaWeapons+"\n Number Of photon Torpedos: "+numberOfPhotonTorpedos+"\n"+
				   "====================================================================================";
		return result;
	}
	
}
