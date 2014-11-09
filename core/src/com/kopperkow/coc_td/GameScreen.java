package com.kopperkow.coc_td;

import java.util.ArrayList;

import com.badlogic.gdx.ScreenAdapter;
import com.kopperkow.coc_td.Objects.Tower;

public class GameScreen extends ScreenAdapter {

	private ArrayList<Tower> towers = new ArrayList<Tower>();
	
	private TDGame game;
	
	public GameScreen(TDGame game){
		this.game = game;
		setupScreen();
	}
	
	public void render(float delta){
		update(delta);
		draw();
	}
	
	private void update(float delta){
		
	}
	
	private void draw(){
		
	}
	
	private void setupScreen(){
		
	}
}
