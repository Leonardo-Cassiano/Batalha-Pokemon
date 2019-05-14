package batalhaPokemon;

public class Dewgong extends Pokemon{
	
	int HP = 384;
	int HPMAX = 384;
	String Nome = "Dewgong";
	int Type1 = 15;
	int Type2 = 10;
	int Def = 284;
	int Atk = 262;
	int speed = 262;
	int pokeball = 4;
	
	public int IceBeam(int defender) {
		int Damage;
		int Type = 15;
		Damage = (((42 * 90 * (339/defender))/50) + 2);
		return Damage;
	}
	public int WaterFall(int defender) {
		int Damage;
		int Type = 10;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int DoubleEdge(int defender) {
		int Damage;
		int Type = 11;
		Damage = (((42 * 120 * (339/defender))/50) + 2);
		HP = HP - Damage/4;
		return Damage;
	}
	public void SheerCold(int defender) {
		int Type = 15;
		System.out.println("One hit to KO");
		
	}	
}