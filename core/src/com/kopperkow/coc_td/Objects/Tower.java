package com.kopperkow.coc_td.Objects;

public class Tower {
	
	private float range; //MAX is 20
	private float damage; // MAX is 50
	private int damageType; // AREA or SINGLE
	private int buffType; //Damage, Range, or Speed
	private float attackSpeed; // MAX is 1 (1 is lowest 20 is highest, 1 = fast)

	public static int AREA = 0;
	public static int SINGLE = 1;
	public static int DAMAGEBUFF = 2;
	public static int RANGEBUFF = 3;
	public static int SPEEDBUFF = 4;
	
	public Tower(){
		
	}

	public Tower(float range, float beginningDamage, int damageType, int buffType, float attackSpeed) {
		this.range = range;
		this.damage = beginningDamage;
		this.damageType = damageType;
		this.buffType = buffType;
		this.attackSpeed = attackSpeed;
	}
	
	public void update(float delta){
		
	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public float getDamage() {
		return damage;
	}

	public void setDamage(float damage) {
		this.damage = damage;
	}

	public int getDamageType() {
		return damageType;
	}

	public void setDamageType(int damageType) {
		this.damageType = damageType;
	}
	
	public int getBuffType() {
		return buffType;
	}
	
	public int setBuffType(int buffType) {
		this.buffType = buffType;
	}

	public float getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(float attackSpeed) {
		this.attackSpeed = attackSpeed;
	}
	
	
}
