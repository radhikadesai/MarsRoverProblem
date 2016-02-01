import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class MarsRoverProblemTest {

	@Test
	public void itRotatesMarsRoverByL() {
		//Given
		MarsRover marsRover=new MarsRover(1,2,Directions.NORTH);
		Directions expectedDirection=Directions.WEST;
		//When
		marsRover.rotatesToLeft();
		Directions actualDirection=marsRover.getDirection();
		//Then
		Assert.assertEquals(expectedDirection, actualDirection);
	}

	@Test
	public void itRotatesMarsRoverByR() {
		//Given
		MarsRover marsRover=new MarsRover(1,2,Directions.NORTH);
		Directions expectedDirection=Directions.EAST;
		//When
		marsRover.rotatesToRight();
		Directions actualDirection=marsRover.getDirection();
		//Then
		Assert.assertEquals(expectedDirection, actualDirection);
	}
	@Test
	public void itMovesMarsRoverByM() {
		//Given
		MarsRover marsRover=new MarsRover(1,2,Directions.NORTH);
		int expectedPositionX=1;
		int expectedPositionY=3;
		//When
		marsRover.movesInSameDirection();
		int actualPositionX=marsRover.getX();
		int actualPositionY=marsRover.getY();
		//Then
		Assert.assertEquals(expectedPositionX, actualPositionX);
		Assert.assertEquals(expectedPositionY, actualPositionY);
	}

}
