package com.kopperkow.coc_td.Towers;

import com.kopperkow.coc_td.Objects.Tower;

public class FireTower extends Tower {
	
	private static final float RANGE = 8;
	private static final float BEGINNING_DAMAGE = 18;
	private static final int DAMAGE_TYPE = Tower.AREA;
	private static final float BEGINNING_ATTACK_SPEED = 5;
	
	/**
	 * create an fire tower
	 * @param x
	 * @param y
	 */
	public FireTower(int x, int y){
		super(RANGE, BEGINNING_DAMAGE, AREA, BEGINNING_ATTACK_SPEED);
	}
}
