package batalhaPokemon;

public class Doduo extends Pokemon{
	
	int HP = 272;
	int HPMAX = 272;
	String Nome = "Dodou";
	int Type1 = 6;
	int Type2 = 11;
	int Def = 207;
	int Atk = 295;
	int speed = 273;
	int pokeball = 5;
	
	public int Trash(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 120 * (339/defender))/50) + 2);
		return Damage;
	}
	public int DrillPeck(int defender) {
		int Damage;
		int Type = 6;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int JumpKick(int defender) {
		int Damage;
		int Type = 4;
		Damage = (((42 * 100 * (339/defender))/50) + 2);
		return Damage;
	}
	public int QuickAtack(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 40 * (339/defender))/50) + 2);
		return Damage;
	}	
}