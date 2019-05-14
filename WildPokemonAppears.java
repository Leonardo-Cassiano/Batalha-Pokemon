package batalhaPokemon;

import java.util.TimerTask;

public class WildPokemonAppears extends Event{
	
	int dice = 100;
	int empty = 2;
	int numpok = (int)(dice * Math.random());
	int chance = (int)(dice * Math.random());
	int rodada = 0;
	boolean success = false;
	MewWild mew = new MewWild();
	SquirtleWild squirtle = new SquirtleWild();
	CharmanderWild charmander = new CharmanderWild();
	BulbasaurWild bulbasaur = new BulbasaurWild();
	Pikachu pikachu = new Pikachu();
	Treinador treinador = new Treinador("Leo");
	java.util.Timer t = new java.util.Timer();
	
	
	public WildPokemonAppears(long eventtime,Treinador treinador){
		super(eventtime);
		treinador.Team[1] = pikachu;
	}
	
	
	public void action() {
		java.util.Timer t = new java.util.Timer();
		empty = 2;
		treinador.Team[1] = pikachu;
		treinador.Team[1].Atk = 229;
		treinador.Team[1].Def = 174;
		treinador.Team[1].HP = 274;
		treinador.Team[1].HPMAX = 274;
		treinador.Team[1].speed = 306;
		treinador.Team[1].Type1 = 3;
		treinador.Team[1].Type1 = 3;
		
		
		t.schedule(new TimerTask() {

            @Override
            public void run() {
       

            }
        }, 5000, 5000);
		
		
		
		
		
		if(numpok <= 33) {
			rodada = 0;
			success = false;
			System.out.println("A wild Squirtle appeared");
			
			t.schedule(new TimerTask() {
				public void run() {
					
			
			while(squirtle.HP > 0 && success == false) {
				if(treinador.Team[1].HP < 30) {
					treinador.UsarItem(treinador.Team[1], "FullRestore");
					
					System.out.println("Squirtle used Tackle");
					treinador.Team[1].HP = treinador.Team[1].HP - 40;
				
					if(treinador.Team[1].HP <= 0) {
						System.out.println("Pikachu fainted and you lose");
						break;
					}
					
					rodada = 0;
				}
				else if(rodada == 0 || (empty > 6 && rodada == 1)) {
					rodada = 1;
					if(treinador.Team[1].speed >= squirtle.speed) {
						
						System.out.println("Pikachu used ThunderShock");
						squirtle.HP = squirtle.HP - 60;
						
						if(squirtle.HP <= 0) {
							System.out.println("Squirtle fainted");	
							break;
						}
						System.out.println("Squirtle used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				
				}
				else if(treinador.Team[1].speed < squirtle.speed) {
					System.out.println("Squirtle used Tackle");
					treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
					if(treinador.Team[1].HP <= 0) {
						System.out.println("Pikachu fainted and you lose");
						break;
					}
						
					System.out.println("Pikachu used ThunderShock");
					squirtle.HP = squirtle.HP - 60;
						
					if(squirtle.HP <= 0) {
						System.out.println("Squirtle fainted");	
						break;
					}
						
					}
				}
				else if(rodada == 1 && empty <= 6) {
					rodada = 0;
					System.out.println(treinador.Nome + " " +"used a pokeball");
					if(chance <= (squirtle.HPMAX * 255 * 4) /(squirtle.HP * 8)) {
						treinador.Team[empty] = squirtle;
						System.out.println(treinador.Nome + " " + "captured a Squirtle");
						empty++;
						success = true;
						break;
					}
					else
						System.out.println("Squirtle has escaped");
						System.out.println("Squirtle used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
					
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				}
			
			}
		}
	}, 2500, 2500);
			
		}
		else if(33 < numpok && numpok <= 66) {
			rodada = 0;
			success = false;
			System.out.println("A wild Charmander appeared");
			
			
			t.schedule(new TimerTask() {

	            @Override
	            public void run() {
		
			while(charmander.HP > 0 && success == false) {
				if(treinador.Team[1].HP < 30) {
					treinador.UsarItem(treinador.Team[1], "FullRestore");
					
					System.out.println("Charmander used Tackle");
					treinador.Team[1].HP = treinador.Team[1].HP - 40;
					
					if(treinador.Team[1].HP <= 0) {
						System.out.println("Pikachu fainted and you lose");
						break;
					}
					rodada = 0;
				}
				else if(rodada == 0 || (empty > 6 && rodada == 1)) {
					rodada = 1;
					if(treinador.Team[1].speed >= charmander.speed) {
						
						System.out.println("Pikachu used ThunderShock");
						charmander.HP = charmander.HP - 60;
						
						if(charmander.HP <= 0) {
							System.out.println("Charmander fainted");	
							break;
						}
						System.out.println("Charmander used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				
					}
					else if(treinador.Team[1].speed < charmander.speed) {
						System.out.println("Charmander used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
						
						System.out.println("Pikachu used ThunderShock");
						charmander.HP = charmander.HP - 60;
						
						if(squirtle.HP <= 0) {
							System.out.println("charmander fainted");	
							break;
						}
						
					}
				}
				else if(rodada == 1 && empty <= 6) {
					rodada = 0;
					System.out.println(treinador.Nome + " " +"used a pokeball");
					if(chance <= (charmander.HPMAX * 255 * 4) /(charmander.HP * 8)) {
						treinador.Team[empty] = charmander;
						System.out.println(treinador.Nome + " " + "captured a Charmander");
						empty++;
						success = true;
						break;
					}
					else
						System.out.println("Charmander has escaped");
						System.out.println("Charmander used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
					
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				}
				
				
			}
	       }
	      }, 2500, 2500);
			
		}
		else if(66 < numpok && numpok <= 99) {
			rodada = 0;
			success = false;
			System.out.println("A wild Bulbasaur appeared");
			
			t.schedule(new TimerTask() {

	            @Override
	            public void run() {
	
			
			while(bulbasaur.HP > 0 && success == false) {
				if(treinador.Team[1].HP < 30) {
					treinador.UsarItem(treinador.Team[1], "FullRestore");
					
					System.out.println("Bulbasaur used Tackle");
					treinador.Team[1].HP = treinador.Team[1].HP - 40;
					
					if(treinador.Team[1].HP <= 0) {
						System.out.println("Pikachu fainted and you lose");
						break;
					}
					
					rodada = 0;
				}
				else if(rodada == 0 || (empty > 6 && rodada == 1)) {
					rodada = 1;
					if(treinador.Team[1].speed >= bulbasaur.speed) {
						
						System.out.println("Pikachu used ThunderShock");
						bulbasaur.HP = bulbasaur.HP - 60;
						
						if(bulbasaur.HP <= 0) {
							System.out.println("Bulbasaur fainted");	
							break;
						}
						System.out.println("Bulbasaur used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				
					}
					else if(treinador.Team[1].speed < bulbasaur.speed) {
						System.out.println("Bulbasaur used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
						
						System.out.println("Pikachu used ThunderShock");
						bulbasaur.HP = bulbasaur.HP - 60;
						
						if(bulbasaur.HP <= 0) {
							System.out.println("Bulbasaur fainted");	
							break;
						}
						
					}
				}
				else if(rodada == 1 && empty <= 6) {
					rodada = 0;
					System.out.println(treinador.Nome + " " + "used a pokeball");
					if(chance <= (bulbasaur.HPMAX * 255 * 4) /(bulbasaur.HP * 8)) {
						treinador.Team[empty] = bulbasaur;
						System.out.println(treinador.Nome + " " +"captured Bulbasaur");
						empty++;
						success = true;
						break;
					}
					else
						System.out.println("Bulbasaur has escaped");
						System.out.println("Bulbasaur used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
					
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				}
				
			}
	      }
    }, 2500, 2500);
			
			
		}
		if(numpok == 100){
			rodada = 0;
			success = false;
			System.out.println("A wild Mew appeared!!, OMG, what about Milostwo???");
			
			t.schedule(new TimerTask() {

	            @Override
	            public void run() {
	     
			while(mew.HP > 0 && success == false) {
				if(treinador.Team[1].HP < 30) {
					treinador.UsarItem(treinador.Team[1], "FullRestore");
					
					System.out.println("Mew used Pound");
					treinador.Team[1].HP = treinador.Team[1].HP - 40;
					
					if(treinador.Team[1].HP <= 0) {
						System.out.println("Pikachu fainted and you lose");
						break;
					}
					rodada = 0;
				}
				else if(rodada == 0 || (empty > 6 && rodada == 1)) {
					rodada = 1;
					if(treinador.Team[1].speed >= mew.speed) {
						
						System.out.println("Pikachu used ThunderShock");
						mew.HP = mew.HP - 60;
						
						if(mew.HP <= 0) {
							System.out.println("Mew fainted");	
							break;
						}
						System.out.println("Mew used Pound");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				
					}
					else if(treinador.Team[1].speed < mew.speed) {
						System.out.println("Mew used Pound");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
						
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
						
						System.out.println("Pikachu used ThunderShock");
						mew.HP = mew.HP - 60;
						
						if(mew.HP <= 0) {
							System.out.println("Mew fainted");	
							break;
						}
						
					}
				}
				else if(rodada == 1 && empty <= 6) {
					rodada = 0;
					System.out.println(treinador.Nome + " " +"used a pokeball");
					if(chance <= (mew.HPMAX * 255 * 4) /(mew.HP * 8)) {
						treinador.Team[empty] = mew;
						System.out.println(treinador.Nome + " " +"captured a Mew");
						empty++;
						success = true;
						break;
					}
					else
						System.out.println("Mew has escaped");
						System.out.println("Mew used Tackle");
						treinador.Team[1].HP = treinador.Team[1].HP - 40;
					
						if(treinador.Team[1].HP <= 0) {
							System.out.println("Pikachu fainted and you lose");
							break;
						}
				}
				
			
			}
		}
    }, 5000, 5000);
		}
		
	}
	
	public String description() {
		return "The battle is over";
	}
}
