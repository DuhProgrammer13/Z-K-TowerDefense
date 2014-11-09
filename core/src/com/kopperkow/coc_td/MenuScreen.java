package com.kopperkow.coc_td;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MenuScreen extends ScreenAdapter {
	SpriteBatch batch;
	Texture img;
	
	private TDGame game;
	
	public MenuScreen(TDGame game){
		this.game = game;
		setupScreen();
	}
	
	@Override
	public void render(float delta){
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0, 100, 100);
		batch.end();
	}
	
	private void setupScreen(){
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}
	
}
