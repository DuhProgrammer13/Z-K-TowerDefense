package com.kopperkow.coc_td.Towers;

import com.kopperkow.coc_td.Objects.Tower;

public class BombTower extends Tower{
	
	private static final float RANGE = 15;
	private static final float BEGINNING_DAMAGE = 14;
	private static final int DAMAGE_TYPE = Tower.AREA;
	private static final float BEGINNING_ATTACK_SPEED = 4;
	
	/**
	 * create an bomb tower
	 * @param x
	 * @param y
	 */
	public BombTower(int x, int y){
		super(RANGE, BEGINNING_DAMAGE, AREA, BEGINNING_ATTACK_SPEED);
	}

}
