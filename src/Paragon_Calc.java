

/*
 * Start the JVM and run Paragon_Calc.java on it by calling the following
 */
public class Paragon_Calc {

	/*
	 * Stub a main so we can escape the static context of the JVM
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		new main();
		System.out.println("Goodbye World");
	}
}

/*
 * Main execution begins here for testing all functionality
 */
class main{
	
	main(){
		this.doStuff();
	}
	
	public void doStuff(){

		
		CardReader cr = new CardReader();
		Card[] myCards = cr.loadCards();
		
		for (int n = 0; n<1000; n++)
		{
			System.out.println(myCards[n].getName()+" "+myCards[n].getCost()+" "+myCards[n].getAffinity()+" "+((EquipmentCard) myCards[n]).getFillBonus()[0]);
		}
	}
	

	/*
	 * This function calcualtes raw damage a Hero will be able to do to an enemy
	 */
	
	/*
	public double getRawDamage (Hero hero, EquipmentCard[] hand, ATTACK attack)
	{
		double rawDmg    = 0;
		double scaling   = hero.getCardScale();
		double bonusDmg  = 0;
		double baseDmg   = 0;
		//double armorMitigation = getArmorMitigation(hero);
		switch(attack)
		{
			case LC:
				baseDmg = hero.getLc_BaseDmg();
				break;
			case Q:
				baseDmg = hero.getQ_BaseDmg();
				break;
			case E:
				baseDmg = hero.getE_BaseDmg();
				break;
			case R:
				baseDmg = hero.getR_BaseDmg();
				break;
			case RC:
				baseDmg = hero.getRc_BaseDmg();
				break;
			default:
			break;
		
		}
		
		
		//TODO: This loop will need some work. We want to look through a Hero's hand in order to find the upgrades and fill bonuses 
		for (int i=0; i < hand.length; i++)
		{
			//loop through all upgrades to add up all upgrade bonuses
			for(int j=0; j < hand[i].length; j++)
			{
				//bonusDmg = bonusDmg + hand[i]

				if(hand[i].isFilled))
					bonusDmg = bonusDmg + hand[i].getFillBonus();
			}

	
	
		}
	
		
		//TODO: Once the numbers are collected, we can calculate raw damage
		//rawDamage = baseDmg + (bonusDmg + scaling)
		return rawDmg;
	}
		*/
	
	/*
	 * This function will calculate effective damage done to a Hero
	 */

	public double getEffectiveDamage (Hero hero, double rawDmg, double pen) //we will put our parameters in here
	{

		double armor = hero.getBasicResist();
		int level = hero.getLevel();
		
		//TODO: Similar to getRawDamage, need to cycle thru Hero's hand to calculate bonus resistance


		
		//Monolith formula from v.35 is not released yet. 
		//double armorMitigation = rawDamage * (1-(100/1+(armor - pen));
		
		//Agora formula
		double effectiveDmg = rawDmg * 1-((armor - pen)/(100 + (armor - pen) + (10*(level -1))));
		
		
		return effectiveDmg;
	}
	

}
