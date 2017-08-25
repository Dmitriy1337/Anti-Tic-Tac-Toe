
public class SystemLog {
Constants c = new Constants();
	public void log(String message){
		System.out.print(message);
	}
	public void logn(String message){
		System.out.println(message);
	}
	public void logOneDMass(String message,int mass[]){
		logn(message);
		System.out.println(mass.toString());
	}
	
	public void checkNearMN(Cell ce){
		for(int i = 0;i<8;i++){
		log("/"+ce.getNearMass()[i]);
		
		}
		logn("");
	}
	
	public void logTwoDMass(String message,int mass[]){
		logn(message);
		System.out.println(mass.toString());
	}
	public void logCellDMass(String message,Cell mass[][]){
		logn(message);
		for(int i = 0;i<c.DIMENSION_MASS;i++){
			for(int j = 0;j<c.DIMENSION_MASS;j++){
				mass[i][j].getLocationX();
				mass[i][j].getLocationY();
			for(int k = 0;k<8;k++){
				log(" "+mass[i][j].getNearMass()[k]);
			}
			logn("");
			
			}
		}
		
	}


}
