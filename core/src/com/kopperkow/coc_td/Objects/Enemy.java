package com.kopperkow.coc_td.Objects;

import com.kopperkow.coc_td.model.Path;

public class Enemy {
	
	private float movementSpeed; // MAX is 1 (1 is lowest 20 is highest, 1 = fast)
	private float damageResistance; // MAX is 1 (1 is lowest 20 is highest, 1 = high resistance)
	private Path path;
	
	public Enemy(){
		
	}
	
	public Enemy(float movementSpeed, float damageResistance) {

		this.movementSpeed = movementSpeed;
		this.damageResistance = damageResistance;
	}
	
	public void update(float delta){
		
	}
	
	public void draw(float x, float y, float width, float height){
		
	}
	
	public float getMovementSpeed() {
		return movementSpeed;
	}

	public void setMovementSpeed(float movementSpeed) {
		this.movementSpeed = movementSpeed;
	}
	
	public float getDamageResistance() {
		return damageResistance;
	}

	public void setDamageResistance(float damageResistance) {
		this.damageResistance = damageResistance;
	}
	
	public Path getPath(){
		return path;
	}
	
	public void setPath(Path path){
		this.path = path;
	}
}
