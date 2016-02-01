import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by radhikadesai on 1/31/16.
 */

public class MarsRover {
	int x;
	int y;
	Directions direction;

	public MarsRover(int x, int y, Directions direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Directions getDirection() {
		return direction;
	}

	public void setDirection(Directions direction) {
		this.direction = direction;
	}

	public void rotatesToLeft() {
		this.setDirection(this.getDirection().left());

	}

	public void rotatesToRight() {
		this.setDirection(this.getDirection().right());
	}

	public void movesInSameDirection() {
		this.setY(this.getDirection().getyAxis()+this.getY());
		this.setX(this.getDirection().getxAxis()+this.getX());
	}

}
