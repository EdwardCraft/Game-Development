package util;
import java.awt.image.BufferedImage;

public class Assets{

	private SpriteSheet chi;
	private SpriteSheet chiRun;
	private SpriteSheet chiHit;
	private BufferedImage chiIdel;
	private BufferedImage chiR;
	private BufferedImage chiH;
	private BufferedImage[] chiSpriteSheet;
	private BufferedImage[] chiSpriteRun;
	private BufferedImage[] chiSpriteHit;
	private BufferedImageLoader imageloader;


	public Assets(){
		chiSpriteSheet = new BufferedImage[10];
		chiSpriteRun = new BufferedImage[8];
		chiSpriteHit = new BufferedImage[5];
		imageloader = new BufferedImageLoader();

		try{

			chiIdel = imageloader.loadImage(Constants.PLAYER_IDEL_CHI_SPRITE_SHEET);
			chiR = imageloader.loadImage(Constants.PLAYER_RUN_CHI_SPRITE_SHEET);
			chiH = imageloader.loadImage(Constants.PLAYER_HIT_CHI_SPRITE_SHEET);
		}catch(Exception e){
			e.printStackTrace();
		}

		chi = new SpriteSheet(chiIdel);
		chiRun = new SpriteSheet(chiR);
		chiHit = new SpriteSheet(chiH);
		getTextures();

	}



	private void getTextures(){

		for(int i = 0; i < 10; i++){
			chiSpriteSheet[i] = chi.grabImage((i + 1), 1, 83, 192);
		}

		for(int j = 0; j < 8; j++){
			chiSpriteRun[j] = chiRun.grabImage((j + 1), 1, 372, 370);
		}

		for(int  k = 0; k < 5; k++){
			chiSpriteHit[k] = chiHit.grabImage((k + 1), 1, 222, 350);
		}


	}

	public BufferedImage[] getChiSpriteSheet(){ return chiSpriteSheet;}
	public BufferedImage[] getChiSpriteRun(){ return chiSpriteRun;}
	public BufferedImage[] getChiSpriteHit(){ return chiSpriteHit;}

}