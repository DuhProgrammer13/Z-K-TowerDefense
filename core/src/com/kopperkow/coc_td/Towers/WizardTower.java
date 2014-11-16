package com.kopperkow.coc_td.Towers;

import com.kopperkow.coc_td.Objects.Tower;

public class WizardTower extends Tower {
	
	private static final float RANGE = 8;
	private static final float BEGINNING_DAMAGE = 15;
	private static final int DAMAGE_TYPE = Tower.SINGLE;
	private static final float BEGINNING_ATTACK_SPEED = 6;
	
	/**
	 * create an wizard tower
	 * @param x
	 * @param y
	 */
	public WizardTower(int x, int y){
		super(RANGE, BEGINNING_DAMAGE, SINGLE, BEGINNING_ATTACK_SPEED);
	}

}
