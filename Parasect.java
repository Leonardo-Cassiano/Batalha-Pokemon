package batalhaPokemon;

public class Parasect extends Pokemon{
	
	int HP = 324;
	int HPMAX = 324;
	String Nome = "Parasect";
	int Type1 = 1;
	int Type2 = 8;
	int Def = 284;
	int Atk = 317;
	int speed = 174;
	int pokeball = 2;
	
	public int XScissor(int defender) {
		int Damage;
		int Type = 1;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int LifeLeech(int defender) {
		int Damage;
		int Type = 1;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Slash(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Absorb(int defender) {
		int Damage;
		int Type = 8;
		Damage = (((42 * 40 * (339/defender))/50) + 2);
		return Damage;
	}	
}