package com.kopperkow.coc_td.Towers;

import com.kopperkow.coc_td.Objects.Tower;

public class ArcherTower extends Tower {
	
	private static final float RANGE = 10;
	private static final float BEGINNING_DAMAGE = 10;
	private static final int DAMAGE_TYPE = Tower.SINGLE;
	private static final float BEGINNING_ATTACK_SPEED = 8;
	
	/**
	 * create an archer tower
	 * @param x
	 * @param y
	 */
	public ArcherTower(int x, int y){
		super(RANGE, BEGINNING_DAMAGE, SINGLE, BEGINNING_ATTACK_SPEED);
	}
}
