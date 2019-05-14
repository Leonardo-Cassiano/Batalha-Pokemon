package batalhaPokemon;

public class Mewtwo extends Pokemon{
	int HP = 416;
	int HPMAX = 416;
	String Nome = "Mewtwo";
	int Type1 = 13;
	int Type2 = 13;
	int Def = 306;
	int Atk = 350;
	int speed = 394;
	int pokeball = 1;
	
	public int Psychic(int defender) {
		int Damage;
		int Type = 13;
		Damage = (((42 * 90 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Swift(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 60 * (339/defender))/50) + 2);
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