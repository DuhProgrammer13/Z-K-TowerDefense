package com.kopperkow.coc_td;

import com.badlogic.gdx.Game;

public class TDGame extends Game {
	
	@Override
	public void create () {
		this.setScreen(new MenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
		System.out.println(System.getProperty("os.name"));
	}
}
