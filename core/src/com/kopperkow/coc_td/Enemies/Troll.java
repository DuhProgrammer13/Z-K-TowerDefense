package com.kopperkow.coc_td.Enemies;

import com.kopperkow.coc_td.Objects.Enemy;

public class Troll extends Enemy {
	
	private static final float MOVEMENT_SPEED = 12;
	private static final float DAMAGE_RESISTANCE = 17;
	
	/**
	 * Instantiate a new Enemy Object Troll
	 * @param x
	 * @param y
	 */
	public Troll(float x, float y){
		super(MOVEMENT_SPEED, DAMAGE_RESISTANCE);
	}
	
	/**
	 * Updates the troll in movement and attack
	 * @param delta Move the troll at a constant pace with FPS
	 */
	@Override
	public void update(float delta){
		
	}
}
