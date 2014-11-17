package com.kopperkow.coc_td;

import java.util.ArrayList;

import com.badlogic.gdx.ScreenAdapter;
import com.kopperkow.coc_td.Objects.Tower;
import com.kopperkow.coc_td.model.TDWorld;

public class GameScreen extends ScreenAdapter {
	
	private TDGame game;
	private TDWorld tdWorld;
	
	private int gameState = 3;
	
	public static int RUNNING = 0;
	public static int PAUSED = 1;
	public static int GAME_OVER = 2;
	public static int BEGIN = 3;
	
	public GameScreen(TDGame game){
		this.game = game;
		this.tdWorld = new TDWorld(this);
		setupScreen();
	}
	
	public void render(float delta){
		update(delta);
		draw();
	}
	
	private void update(float delta){
		this.tdWorld.update(delta);
	}
	
	private void draw(){
		
	}
	
	private void setupScreen(){
		
	}
	
	public void setGameState(int gameState){
		this.gameState = gameState;
	}
	
	public int getGameState(){
		return gameState;
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}
}
