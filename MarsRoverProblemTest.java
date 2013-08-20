import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class MarsRoverProblemTest {

	@Test
	public void itRotatesMarsRoverByL() {
		//Given
		MarsRover marsRover=new MarsRover(1,2,"N");
		String expectedDirection="W";
		//When
		marsRover.rotatesToLeft();
		String actualDirection=marsRover.getDirection();
		//Then
		Assert.assertEquals(expectedDirection, actualDirection);
	}

	@Test
	public void itRotatesMarsRoverByR() {
		//Given
		MarsRover marsRover=new MarsRover(1,2,"N");
		String expectedDirection="E";
		//When
		marsRover.rotatesToRight();
		String actualDirection=marsRover.getDirection();
		//Then
		Assert.assertEquals(expectedDirection, actualDirection);
	}
	@Test
	public void itMovesMarsRoverByM() {
		//Given
		MarsRover marsRover=new MarsRover(1,2,"N");
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
	@Test
	public void itMovesTheRoverAccordingToInputString() throws Exception {
		//Given
		MarsRover marsRover=new MarsRover(3,3,"E");
		int expectedPositionX=5;
		int expectedPositionY=1;
		String expectedDirection="E";
		//When
		marsRover.movesAsPerInputString("MMRMMRMRRM");
		int actualPositionX=marsRover.getX();
		int actualPositionY=marsRover.getY();
		String actualDirection=marsRover.getDirection();
		//Then
		Assert.assertEquals(expectedPositionX, actualPositionX);
		Assert.assertEquals(expectedPositionY, actualPositionY);
		Assert.assertEquals(expectedDirection, actualDirection);
	}
	@Test
	public void itMovesMultipleRovers() throws Exception {
		//Given
		MarsRover marsRover1=new MarsRover(1,2,"N");
		MarsRover marsRover2=new MarsRover(3,3,"E");
		MarsRover marsRover3=new MarsRover(2,4,"W");
		
		int expectedPositionX1=1;
		int expectedPositionY1=3;
		String expectedDirection1="N";
		
		int expectedPositionX2=5;
		int expectedPositionY2=1;
		String expectedDirection2="E";
		
		int expectedPositionX3=1;
		int expectedPositionY3=1;
		String expectedDirection3="S";
		RoverController roverController=new RoverController(marsRover1,marsRover2,marsRover3);
		//When
		roverController.moveTheRoversAsPerInputStrings("LMLMLMLMM","MMRMMRMRRM","LMRMLMM");
		
		int actualPositionX1=marsRover1.getX();
		int actualPositionY1=marsRover1.getY();
		String actualDirection1=marsRover1.getDirection();
		
		int actualPositionX2=marsRover2.getX();
		int actualPositionY2=marsRover2.getY();
		String actualDirection2=marsRover2.getDirection();
		
		int actualPositionX3=marsRover3.getX();
		int actualPositionY3=marsRover3.getY();
		String actualDirection3=marsRover3.getDirection();
		//Then
		Assert.assertEquals(expectedPositionX1, actualPositionX1);
		Assert.assertEquals(expectedPositionY1, actualPositionY1);
		Assert.assertEquals(expectedDirection1, actualDirection1);
		
		Assert.assertEquals(expectedPositionX2, actualPositionX2);
		Assert.assertEquals(expectedPositionY2, actualPositionY2);
		Assert.assertEquals(expectedDirection2, actualDirection2);
		
		Assert.assertEquals(expectedPositionX3, actualPositionX3);
		Assert.assertEquals(expectedPositionY3, actualPositionY3);
		Assert.assertEquals(expectedDirection3, actualDirection3);
	
	}

}
