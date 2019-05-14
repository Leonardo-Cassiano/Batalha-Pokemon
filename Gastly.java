package batalhaPokemon;

public class Gastly extends Pokemon{
	
	int HP = 264;
	int HPMAX = 264;
	String Nome = "Gastly";
	int Type1 = 7;
	int Type2 = 12;
	int Def = 174;
	int Atk = 185;
	int speed = 284;
	int pokeball = 1;
	
	public float Lick(int defender) {
		float Damage;
		int Type = 7;
		Damage = (((42 * 30 * (339/defender))/50) + 2);
		return Damage;
	}
	public int ShadowBall(int defender) {
		int Damage;
		int Type = 7;
		Damage = (((42 * 80 * (339/defender))/50) + 2);
		return Damage;
	}
	public int DreamEater(int defender) {
		int Damage;
		int Type = 13;
		Damage = (((42 * 100 * (339/defender))/50) + 2);
		return Damage;
	}
	public int Smog(int defender) {
		int Damage;
		int Type = 12;
		Damage = (((42 * 30 * (339/defender))/50) + 2);
		return Damage;
	}	
}