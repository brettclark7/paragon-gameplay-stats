
enum HERONAME{
	CRUNCH(AFFINITY.FURY, AFFINITY.ORDER),
	COUNTESS(AFFINITY.GROWTH, AFFINITY.CORRUPTION),
	KWANG(AFFINITY.ORDER, AFFINITY.CORRUPTION),
	LTBELICA(AFFINITY.INTELLECT, AFFINITY.ORDER),
	NARBASH(AFFINITY.GROWTH, AFFINITY.INTELLECT),
	THEFEY(AFFINITY.GROWTH, AFFINITY.INTELLECT),
	GREYSTONE(AFFINITY.FURY, AFFINITY.INTELLECT),
	KHAIMERA(AFFINITY.GROWTH, AFFINITY.FURY),
	RIKTOR(AFFINITY.INTELLECT, AFFINITY.CORRUPTION),
	GRIMEXE(AFFINITY.INTELLECT, AFFINITY.CORRUPTION),
	IGGYSCORCH(AFFINITY.FURY, AFFINITY.CORRUPTION),
	SEVAROG(AFFINITY.GROWTH, AFFINITY.CORRUPTION),
	HOWITZER(AFFINITY.FURY, AFFINITY.INTELLECT),
	STEEL(AFFINITY.INTELLECT, AFFINITY.ORDER),
	GADGET(AFFINITY.INTELLECT, AFFINITY.ORDER),
	TWINBLAST(AFFINITY.FURY, AFFINITY.GROWTH),
	RAMPAGE(AFFINITY.GROWTH, AFFINITY.FURY),
	DEKKER(AFFINITY.GROWTH, AFFINITY.ORDER),
	KALLARI(AFFINITY.INTELLECT, AFFINITY.CORRUPTION),
	GIDEON(AFFINITY.INTELLECT, AFFINITY.CORRUPTION),
	MURDOCK(AFFINITY.FURY, AFFINITY.INTELLECT),
	FENGMAO(AFFINITY.FURY, AFFINITY.ORDER),
	MURIEL(AFFINITY.GROWTH, AFFINITY.ORDER),
	SPARROW(AFFINITY.GROWTH, AFFINITY.ORDER),
	GRUX(AFFINITY.FURY, AFFINITY.CORRUPTION);	
	
	private AFFINITY affinity1;
	private AFFINITY affinity2;

	HERONAME(AFFINITY affinity1, AFFINITY affinity2)
	{
		this.affinity1 = affinity1;
		this.affinity2 = affinity2;
	}
	
	public AFFINITY getAffinity1(){return affinity1;}
	public AFFINITY getAffinity2(){return affinity2;}
	
}

enum ROLE{
	FIGHTER,
	ASSASSIN,
	CASTER,
	TANK,
	SUPPORT,
	RANGER
}


enum AFFINITY{
	UNIVERSAL,
	FURY,
	INTELLECT,
	GROWTH,
	CORRUPTION,
	ORDER,
}


enum UPGRADE{	
	HEALTH(50),
	HEALTH_REGEN(1.4),
	MANA(75),
	MANA_REGEN(0.3),
	BASIC_RESIST(22),
	ABILITY_RESIST(22),
	COOLDOWN(.025),
	LIFESTEAL(.05),
	POWER(6),
	ATTACK_SPEED(5.5),
	CRIT_CHANCE(.03),
	ABILITY_PEN(4),
	BASIC_PEN(7),
	CRIT_BONUS(.5);
	
	private double value;
	
	UPGRADE(double value){this.value = value;}
	
	public double getUpgradeValue(){return value;}
	
}

enum ATTACK{
	LC,
	Q,
	E,
	R,
	RC
}