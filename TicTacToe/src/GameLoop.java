

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
	
	
	public void changeState(){
		
		for(int i = 0;i<c.DIMENSION_MASS;i++){
			for(int j = 0;j<c.DIMENSION_MASS;j++){
				
				if(((i-1)>=0&&(i-1)<=4)&&((j-1)>=0&&(j-1)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i-1][j-1].getState()==1&&((i-2)>=0&&(i-2)<=4)&&((j-2)>=0&&(j-2)<=4)){
							if(gameField[i-2][j-2].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
				if(((i)>=0&&(i)<=4)&&((j-1)>=0&&(j-1)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i][j-1].getState()==1&&((i)>=0&&(i)<=4)&&((j-2)>=0&&(j-2)<=4)){
							if(gameField[i][j-2].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
				if(((i+1)>=0&&(i+1)<=4)&&((j-1)>=0&&(j-1)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i+1][j-1].getState()==1&&((i+2)>=0&&(i+2)<=4)&&((j-2)>=0&&(j-2)<=4)){
							if(gameField[i+2][j-2].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
				if(((i-1)>=0&&(i-1)<=4)&&((j)>=0&&(j)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i-1][j].getState()==1&&((i-2)>=0&&(i-2)<=4)&&((j)>=0&&(j)<=4)){
							if(gameField[i-2][j].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
				if(((i+1)>=0&&(i+1)<=4)&&((j)>=0&&(j)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i+1][j].getState()==1&&((i-2)>=0&&(i-2)<=4)&&((j-2)>=0&&(j-2)<=4)){
							if(gameField[i+2][j].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
				if(((i-1)>=0&&(i-1)<=4)&&((j+1)>=0&&(j+1)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i-1][j+1].getState()==1&&((i-2)>=0&&(i-2)<=4)&&((j-2)>=0&&(j-2)<=4)){
							if(gameField[i-2][j+2].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
				if(((i)>=0&&(i)<=4)&&((j+1)>=0&&(j+1)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i][j+1].getState()==1&&((i-2)>=0&&(i-2)<=4)&&((j-2)>=0&&(j-2)<=4)){
							if(gameField[i][j+2].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
				if(((i+1)>=0&&(i+1)<=4)&&((j+1)>=0&&(j+1)<=4)){
					if(gameField[i][j].getState()==1){
						if(gameField[i+1][j+1].getState()==1&&((i-2)>=0&&(i-2)<=4)&&((j-2)>=0&&(j-2)<=4)){
							if(gameField[i+2][j+2].getState()==1){
								
								sLog.logn("ffffffffffffffffffffffffffffffffffffffffffffffffff");
								
							}
							
							
						}
						
						
					}
				}//	
			
			}
			
		
		}
		
		
	}
	
	
	public void changeNearMass(){
		
		for(int i = 0;i<c.DIMENSION_MASS;i++){
			for(int j = 0;j<c.DIMENSION_MASS;j++){
				if(((i-1)>=0&&(i-1)<=4)&&((j-1)>=0&&(j-1)<=4)){
					gameField[i][j].getNearMass()[0]=gameField[i-1][j-1].getState();
					sLog.logn("check");
				}
				if(((i)>=0&&(i)<=4)&&((j-1)>=0&&(j-1)<=4)){
					gameField[i][j].getNearMass()[1]=gameField[i][j-1].getState();
					sLog.logn("check");
				}
				if(((i+1)>=0&&(i+1)<=4)&&((j-1)>=0&&(j-1)<=4)){
					gameField[i][j].getNearMass()[2]=gameField[i+1][j-1].getState();
					sLog.logn("check");
				}
				if(((i-1)>=0&&(i-1)<=4)&&((j)>=0&&(j)<=4)){
					gameField[i][j].getNearMass()[3]=gameField[i-1][j].getState();
					sLog.logn("check");
				}
				if(((i+1)>=0&&(i+1)<=4)&&((j-1)>=0&&(j-1)<=4)){
					gameField[i][j].getNearMass()[4]=gameField[i+1][j].getState();
					sLog.logn("check");
				}
				if(((i-1)>=0&&(i-1)<=4)&&((j+1)>=0&&(j+1)<=4)){
					gameField[i][j].getNearMass()[5]=gameField[i-1][j+1].getState();
					sLog.logn("check");
				}
				if(((i)>=0&&(i)<=4)&&((j+1)>=0&&(j+1)<=4)){
					gameField[i][j].getNearMass()[6]=gameField[i][j+1].getState();
					sLog.logn("check");
				}
				if(((i+1)>=0&&(i+1)<=4)&&((j+1)>=0&&(j+1)<=4)){
					gameField[i][j].getNearMass()[7]=gameField[i+1][j+1].getState();
					sLog.logn("check");
				}
				
				
			}
		
		
		
		}
		
		
	}

	
	
	
}
