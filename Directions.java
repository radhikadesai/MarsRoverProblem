/**
 * Created by radhikadesai on 1/31/16.
 */
public enum Directions{

	NORTH(0,1){
		public Directions left(){
			return WEST;
		}
		public Directions right(){
			return EAST;
		}
	},
	SOUTH(0,-1){
		public Directions left(){
			return EAST;
		}
		public Directions right(){
			return WEST;
		}
	},
	EAST(1,0){
		public Directions left(){
			return NORTH;
		}
		public Directions right(){
			return SOUTH;
		}
	},
	WEST(-1,0){
		public Directions left(){
			return SOUTH;
		}
		public Directions right(){
			return NORTH;
		}
	};
	private final int xAxis;
	private final int yAxis;

	Directions(final int xAxis,final int yAxis){
		this.xAxis=xAxis;
		this.yAxis=yAxis;
	}
	public int getxAxis(){
		return this.xAxis;
	}
	public int getyAxis(){
		return this.yAxis;
	}
	public abstract Directions right();
	public abstract Directions left();
}