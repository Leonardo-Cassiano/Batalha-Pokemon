package batalhaPokemon;

public class Squirtle extends Pokemon{
	
	int HP = 292;
	int HPMAX = 292;
	String Nome = "Leonardo";
	int Type1 = 15;
	int Type2 = 15;
	int Def = 251;
	int Atk = 214;
	int speed = 203;
	int pokeball = 2;
	
	public int SkullBash(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 130 * (339/defender))/50) + 2);
		System.out.print("Turtle Power");
		return Damage;
	}
	public int HydroPump(int defender) {
		int Damage;
		int Type = 15;
		Damage = (((42 * 100 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Bubblebeam(int defender) {
		int Damage;
		int Type = 15;
		Damage = (((42 * 65 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Headbutt(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 70 * (339/defender))/50) + 2);
		return Damage;
	}	
}