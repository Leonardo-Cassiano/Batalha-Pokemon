package batalhaPokemon;

public class Machop extends Pokemon{
	
	int HP = 344;
	int HPMAX = 344;
	String Nome = "Machop";
	int Type1 = 4;
	int Type2 = 4;
	int Def = 218;
	int Atk = 284;
	int speed = 185;
	int pokeball = 6;
	
	public int SuperPower(int defender) {
		int Damage;
		int Type = 4;
		Damage = (((42 * 120 * (339/defender))/50) + 2);
		return Damage;
	}
	public int BrickBreak(int defender) {
		int Damage;
		int Type = 4;
		Damage = (((42 * 75 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Submission(int defender) {
		int Damage;
		int Type = 4;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int KarateChop(Pokemon defender) {
		int Damage;
		int Type = 4;
		Damage = (((42 * 50 * (339/defender.Def))/50) + 2);
		return Damage;
	}	
}