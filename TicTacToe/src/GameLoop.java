

public class GameLoop  {
	Constants c = new Constants();
	SystemLog sLog = new SystemLog();
	
	public Cell[][] gameField = new Cell[c.DIMENSION_MASS][c.DIMENSION_MASS];

	
	int nearMass[];
	
	
	public void createField(){//создает массив обьектов клеток 
		nearMass = new int[8];
		for(int i = 7;i>=0;i--){
		nearMass[i]=0;	
			
		}
		
		
		for(int i=0;i<c.DIMENSION_MASS;i++){
			for(int j=0;j<c.DIMENSION_MASS;j++){
				gameField[i][j] = new Cell(i,j,nearMass,0);
				
			}
		}
		sLog.logCellDMass("cellMassive",gameField);
		
		
		
	}
	

	
	
	
}
