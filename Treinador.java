package batalhaPokemon;

public class Treinador { 
	
	String Nome;
	Pokemon Team[];
	
	public Treinador(String nome) {
		Nome = nome;
		Team = new Pokemon[8];
	}

	
	public void UsarItem(Pokemon atual,String item){
		int prioridade = 2;
		
		if(item == "Potion") {
			atual.HP = atual.HP + 20;
		}
		
		else if(item == "SuperPotion") {
			atual.HP = atual.HP + 50;
		}
		
		else if(item == "HyperPotion") {
			atual.HP = atual.HP + 200;
		}
		else if(item == "FullRestore") {
			atual.HP = atual.HPMAX;
		}
		
		if(atual.HP > atual.HPMAX) {
			atual.HP = atual.HPMAX;
		}
	}
	
	public void TrocarPokemon(Pokemon atual,Pokemon Pokeball){
		int prioridade = 3;
		
		if(Pokeball.HP == 0) {
			System.out.println(atual.Nome +" is unable to battle.");
		}
		else
			if(atual.pokeball == 1) {
				Team[1] = atual;
				Team[7] = Pokeball;
			}
		
			else if(atual.pokeball == 2) {
				Team[2] = atual;
				Team[7] = Pokeball;
			}
		
			else if(atual.pokeball == 3) {
				Team[3] = atual;
				Team[7] = Pokeball;
			}
			else if(atual.pokeball == 4) {
				Team[4] = atual;
				Team[7] = Pokeball;
			}
			else if(atual.pokeball == 5) {
				Team[5] = atual;
				Team[7] = Pokeball;
			}
			else if(atual.pokeball == 6) {
				Team[6] = atual;
				Team[7] = Pokeball;
			}
			
	}
	
	public void FugirBatalha() {
		int prioridade = 4;
		System.out.println(Nome + " fleed from the battle.");
	}
	public void UsePokeball(Pokemon snag,int empty) {
		Team[empty] = snag;
	}
	
	public void teamformation(Pokemon pokemon1, Pokemon pokemon2, Pokemon pokemon3, Pokemon pokemon4, Pokemon pokemon5, Pokemon pokemon6) {
			Team[1] = pokemon1;
			Team[2] = pokemon2;
			Team[3] = pokemon3;
			Team[4] = pokemon4;
			Team[5] = pokemon5;
			Team[6] = pokemon6;
			Team[7] = pokemon1;//Pokemon atual
		
	}
}
