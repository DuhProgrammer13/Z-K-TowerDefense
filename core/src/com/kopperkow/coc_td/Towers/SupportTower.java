package com.kopperkow.coc_td.Towers;

import com.kopperkow.coc_td.Objects.Tower;

public class SupportTower extends Tower {
	
	private static final float RANGE = 18;
	private static final float BEGINNING_BUFF = 6;
	private static final int BUFF_TYPE = Tower.DAMAGEBUFF;
	private static final float BEGINNING_BUFF_SPEED = 6;
	
	/**
	 * create an support tower
	 * @param x
	 * @param y
	 */
	public SupportTower(int x, int y){
		super(RANGE, BEGINNING_BUFF, DAMAGEBUFF, BEGINNING_BUFF_SPEED);
	}
}
