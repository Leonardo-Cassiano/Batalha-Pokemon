package batalhaPokemon;

public class Venonat extends Pokemon{
	
	int HP = 324;
	int HPMAX = 324;
	String Nome = "Venonat";
	int Type1 = 1;
	int Type2 = 12;
	int Def = 218;
	int Atk = 229;
	int speed = 207;
	int pokeball = 4;
	
	public int Psychic(int defender) {
		int Damage;
		int Type = 13;
		Damage = (((42 * 90 * (339/defender))/50) + 2);
		return Damage;
	}
	public int LeechLife(int defender) {
		int Damage;
		int Type = 1;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Psybeam(int defender) {
		int Damage;
		int Type = 13;
		Damage = (((42 * 65 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Confusion(int defender) {
		int Damage;
		int Type = 13;
		Damage = (((42 * 50 * (339/defender))/50) + 2);
		return Damage;
	}	
}