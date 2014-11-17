package com.kopperkow.coc_td.model;

import java.util.ArrayList;

import com.kopperkow.coc_td.GameScreen;
import com.kopperkow.coc_td.Objects.Tower;

public class TDWorld {
	
	//Use Game Screen to communicate with the screen and rendering
	private GameScreen gs;
	
	//All objects in the game
	private ArrayList<Tower> towers = new ArrayList<Tower>();
	
	public TDWorld(GameScreen gs){
		this.gs = gs;
		
	}
	
	public void update(float delta){
		for (Tower t: towers){
			t.update(delta);
		}
	}
	
	private void save(){
		gs.save();
	}
	
}
