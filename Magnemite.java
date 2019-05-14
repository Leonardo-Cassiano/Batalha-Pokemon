package batalhaPokemon;

public class Magnemite extends Pokemon{
	
	int HP = 254;
	int HPMAX = 254;
	String Nome = "Magnemite";
	int Type1 = 3;
	int Type2 = 3;
	int Def = 262;
	int Atk = 185;
	int speed = 207;
	int pokeball = 3;
	
	public int Thunder(int defender) {
		int Damage;
		int Type = 3;
		Damage = (((42 * 110 * (339/defender))/50) + 2);
		return Damage;
	}
	public int ThunderBolt(int defender) {
		int Damage;
		int Type = 3;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int ThunderShock(int defender) {
		int Damage;
		int Type = 3;
		Damage = (((42 * 40 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Tackle(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 40 * (339/defender))/50) + 2);
		return Damage;
	}	
}