
public class Cell {
public int location_x;
public int location_y;
public int[] nearMass=new int[8];
public int State;
SystemLog sLog = new SystemLog();
	public Cell(int x,int y,int[]mass,int state){
		
		nearMass=mass;
		location_x = x;
		location_y=y;
		State = state;
		
	}
	
	public int getLocationX(){
	sLog.log("  LOCATION_X "+this.location_x);
	return this.location_x;
	}
	
	public int getLocationY(){
		sLog.log("  LOCATION_Y"+this.location_y);
		return this.location_y;
		}
		
	public int[]getNearMass(){
		//sLog.logOneDMass("  NEAR_MASSIVE",this.nearMass);
		return this.nearMass;
	}
	
	
	public int getState(){
		///sLog.log(" NEAR_MASSIVE"+this.State);
		return this.State;
		
		}
	
	public void setState(int s){
		
		this.State=s;
		sLog.log("  STATE "+this.State);
		
		}
	public void setLocationX(int x){
		this.location_x=x;
		sLog.logn("  LOCATION_X "+this.location_x);
		
		}
		
	
	public void setLocationY(int y){
			this.location_y=y;
			sLog.logn("  LOCATION_Y"+this.location_y);
			
			}
			
		public void setNearMass(int[]mass){
			this.nearMass=mass;
			//sLog.logOneDMass("  NEAR_MASSIVE",this.nearMass);
				
			
		}

		
		
}
