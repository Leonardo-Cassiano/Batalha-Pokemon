package batalhaPokemon;

public class Exeggutor extends Pokemon{
	int HP = 394;
	int HPMAX = 394;
	String Nome = "Exeggutor";
	int Type1 = 8;
	int Type2 = 13;
	int Def = 296;
	int Atk = 317;
	int speed = 229;
	int pokeball = 3;
	
	public int PowerWhip(int defender) {
		int Damage;
		int Type = 8;
		Damage = (((42 * 120 * (339/defender))/50) + 2);
		return Damage;
	}
	public int EggBomb(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 100 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Confusion(int defender) {
		int Damage;
		int Type = 13;
		Damage = (((42 * 50 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Stomp(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 65 * (339/defender))/50) + 2);
		return Damage;
	}	
}