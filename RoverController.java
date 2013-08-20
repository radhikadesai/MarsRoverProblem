import java.util.ArrayList;

public class RoverController {
	ArrayList<MarsRover> rovers = new ArrayList<MarsRover>();

	public RoverController(MarsRover... marsRovers) {
		for (int i = 0; i < marsRovers.length; i++) {
			rovers.add(marsRovers[i]);
		}
	}

	public void moveTheRoversAsPerInputStrings(String... inputStrings) {
		int i = 0;
		for (MarsRover rover : rovers) {
			rover.movesAsPerInputString(inputStrings[i++]);
		}

	}

}
