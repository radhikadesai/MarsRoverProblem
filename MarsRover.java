public class MarsRover {
	int x;
	int y;
	String direction;

	public MarsRover(int x, int y, String direction) {

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

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void rotatesToLeft() {
		String actualDirection = this.getDirection();
		if (actualDirection.equals("N")) {
			this.setDirection("W");
		} else if (actualDirection.equals("W")) {
			this.setDirection("S");
		} else if (actualDirection.equals("E")) {
			this.setDirection("N");
		} else if (actualDirection.equals("S")) {
			this.setDirection("E");
		}

	}

	public void rotatesToRight() {
		String actualDirection = this.getDirection();
		if (actualDirection.equals("N")) {
			this.setDirection("E");
		} else if (actualDirection.equals("W")) {
			this.setDirection("N");
		} else if (actualDirection.equals("E")) {
			this.setDirection("S");
		} else if (actualDirection.equals("S")) {
			this.setDirection("W");
		}

	}

	public void movesInSameDirection() {
		String actualDirection = this.getDirection();
		if (actualDirection.equals("N")) {
			this.setY(this.getY() + 1);
		} else if (actualDirection.equals("W")) {
			this.setX(this.getX() - 1);
		} else if (actualDirection.equals("E")) {
			this.setX(this.getX() + 1);
		} else if (actualDirection.equals("S")) {
			this.setY(this.getY() - 1);
		}
	}

	public void movesAsPerInputString(String directions) {

		String directionString[] = directions.split("");

		for (String direction : directionString) {
			if (direction.equals("L")) {
				this.rotatesToLeft();
			} else if (direction.equals("R")) {
				this.rotatesToRight();
			} else if (direction.equals("M")) {
				this.movesInSameDirection();
			}
		}
	}

}
