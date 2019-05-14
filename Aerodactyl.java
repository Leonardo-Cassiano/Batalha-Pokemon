package batalhaPokemon;

public class Aerodactyl extends Pokemon{
	int HP = 364;
	int HPMAX = 364;
	String Nome = "Aerodactyl";
	int Type1 = 4;
	int Type2 = 14;
	int Def = 251;
	int Atk = 339;
	int speed = 394;
	int pokeball = 6;
	
	public int Hyperbeam(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 150 * (339/defender))/50) + 2);
		return Damage;
	}
	public int TakeDown(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 90 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Fly(int defender) {
		int Damage;
		int Type = 6;
		Damage = (((42 * 90 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Rockslide(int defender) {
		int Damage;
		int Type = 14;
		Damage = (((42 * 75 * (339/defender))/50) + 2);
		return Damage;
	}	
}
