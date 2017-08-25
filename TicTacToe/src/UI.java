import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UI extends Application {
	SystemLog sLog = new SystemLog();
	GameLoop gameAlgorythms = new GameLoop();
	Constants c = new Constants();
	ImageView[][] imageContainer = new ImageView[c.DIMENSION_MASS][c.DIMENSION_MASS];
	Image crossImage = new Image("img/cross.png");
	AnchorPane windowAnchorPane_1;
	@Override
		public void start(Stage gameWindow) throws Exception {
			
			gameAlgorythms.createField();
			 windowAnchorPane_1 = new AnchorPane();
			Scene mainScene_1= new Scene(windowAnchorPane_1,c.W_SIZE_X,c.W_SIZE_Y);
			Image bg_image = new Image("img/cellsbg.png");
			ImageView iv_bg =new ImageView(bg_image);
			iv_bg.setLayoutX(c.BACKGROUND_X);
			iv_bg.setLayoutY(c.BACKGROUND_Y);
			windowAnchorPane_1.getChildren().add(iv_bg);
			initImageViews();
			
			
			
			
			mainScene_1.setOnMouseClicked(new EventHandler<MouseEvent>(){

				@Override
				public void handle(MouseEvent event) {
					//sLog.log(""+(int)event.getSceneX()/100+" "+(event.getSceneY()-100)/100);
					int x = (int) event.getSceneX()/100;
					int y = (int) (event.getSceneY()-100)/100;
					sLog.log(""+x+" "+y);
					imageContainer[x][y].setVisible(true);
					gameAlgorythms.gameField[x][y].setState(1);
					gameAlgorythms.changeNearMass();
					sLog.logCellDMass("cm", gameAlgorythms.gameField);
				}
				
				
				
			});
			
			
			gameWindow.setScene(mainScene_1);
			gameWindow.show();
			
		
			
		}

	
	public void initImageViews(){
		for(int i = 0;i<c.DIMENSION_MASS;i++){
			for(int j = 0;j<c.DIMENSION_MASS;j++){
				imageContainer[j][i] = new ImageView(crossImage); 
				imageContainer[j][i].setVisible(false);
				imageContainer[j][i].setLayoutX(j*100+17);
				imageContainer[j][i].setLayoutY(i*100+100+12);
				if(j==4){
					imageContainer[j][i].setLayoutY(i*100+100+5);	
				}
				
				windowAnchorPane_1.getChildren().add(imageContainer[j][i]);
			
			
			}	
			
			
		}
		
	}
	
	
	public static void main(String[]args){
		
		
		launch(args);
	}
	
	
}
