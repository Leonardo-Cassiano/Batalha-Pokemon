package batalhaPokemon;

public class Rhydon extends Pokemon{
	
	int HP = 414;
	int HPMAX = 414;
	String Nome = "Whydon't";
	int Type1 = 9;
	int Type2 = 14;
	int Def = 372;
	int Atk = 394;
	int speed = 196;
	int pokeball = 5;
	
	public int EarthQuake(int defender) {
		int Damage;
		int Type = 9;
		Damage = (((42 * 100 * (339/defender))/50) + 2);
		return Damage;
	}
	public int MegaHorn(int defender) {
		int Damage;
		int Type = 1;
		Damage = (((42 * 120 * (339/defender))/50) + 2);
		return Damage;
	}
	public int TakeDown(int defender) {
		int Damage;
		int Type = 13;
		Damage = (((42 * 90 * (339/defender))/50) + 2);
		return Damage;
	}
	public void HornDrill(int defender) {
		int Type = 11;
		System.out.println("One hit to KO");
	}
	
}