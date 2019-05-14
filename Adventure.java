package batalhaPokemon;

public class Adventure extends Controller {
	
	public class Walk extends Event {
		
		int dice = 100;
		double grass = (int) (dice * Math.random());
		int direction = (int) (dice * Math.random());
		Treinador treinador = new Treinador("Leo");
		Pikachu pikachu = new Pikachu();
		long eventtime = System.currentTimeMillis();
		
		final String mapa[][] = {
				{"-","-","-","-","-","-","-","-","-"},
				{"-","*","*","*","*","*"," "," ","-"},	
				{"-","*","*","*","*","*","*"," ","-"},
				{"-","*","*"," "," "," "," "," ","-"},
				{"-","*"," "," "," ","T"," "," ","-"},
				{"-"," "," ","*","*","*"," "," ","-"},
				{"-"," "," ","*","*","*"," "," ","-"},
				{"-"," "," ","*","*","*"," "," ","-"},
				{"-","-","-","-","-","-","-","-","-"},
		};
		int x = 4, y = 5;
		
		public Walk(long eventtime, String mapa[][],Treinador treinador) {
			super(eventtime);
			treinador.teamformation(pikachu,null,null,null,null,null);
			
		}

		public void action() {
			treinador.teamformation(pikachu,null,null,null,null,null);
			WildPokemonAppears wildpokemon = new WildPokemonAppears(eventtime,treinador);
			
			
			if(direction <= 25) {//para cima
				if(mapa[x - 1][y] == "-") {//caso assuma uma posição que não existe na matriz, da a volta no mapa
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
					x = 8;
				}
				if(mapa[x - 1][y] == " ") {
					mapa[x - 1][y] = "T";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
				}
				else if(mapa[x - 1][y] == "*") {
					if(grass <= 50) {
						wildpokemon.action();
					}
					mapa[x - 1][y] = "P";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}

				}
				System.out.println("O treinador foi para cima");
				x = x - 1;
			}
			if( 75 < direction && direction <= 100) {//para esquerda
				if(mapa[x][y - 1] == "-") {
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
					y = 8;
				}
				if(mapa[x][y - 1] == " ") {
					mapa[x][y - 1] = "T";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
				}
				else if(mapa[x][y - 1] == "*") {
					if(grass <= 50) {
						wildpokemon.action();
					}
					mapa[x][y - 1] = "P";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}

				}
				System.out.println("O treinador foi para esquerda");
				y = y - 1;
			}
			if( 50 < direction && direction <= 75) {//para baixo
				if(mapa[x + 1][y] == "-") {
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
					x = 0;
				}
				if(mapa[x + 1][y] == " ") {
					mapa[x + 1][y] = "T";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
				}
				else if(mapa[x + 1][y] == "*") {
					if(grass <= 50) {
						wildpokemon.action();
					}
					mapa[x + 1][y] = "P";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}

				}
				System.out.println("O treinador foi para baixo");
				x = x + 1;
			}
			if( 25 < direction && direction <= 50) {//para direita
				if(mapa[x][y + 1] == "-") {
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
					y = 0;
				}
				
				if(mapa[x][y + 1] == " ") {
					mapa[x][y + 1] = "T";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}
				}
				else if(mapa[x][y + 1] == "*") {
					if(grass <= 50) {
						wildpokemon.action();
					}
					mapa[x][y + 1] = "P";
					if(mapa[x][y] == "T") {
						mapa[x][y] = " ";
					}
					else if(mapa[x][y] == "P") {
						mapa[x][y] = "*";
					}

				}
				System.out.println("O treinador foi para direita");
				y = y + 1;
			}
			
			
			
		}
		public String description() {
			
			
			return "You walked";
		}
		public void main(String[] args) {
			
			long tm = 0;
			Treinador treinador = new Treinador("Leo");
			Pikachu pikachu = new Pikachu();
			
			treinador.teamformation(pikachu, null, null, null, null, null);
			
			Walk walk = new Walk(tm, mapa,treinador);
			int turn;

			System.out.println("The Map");
			for (int l = 0; l < mapa.length; l++){  
				for (int c = 0; c < mapa[0].length; c++){ 
					System.out.print(mapa[l][c] + " "); 
				}  
				System.out.println(" ");
		    }
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	int Time = 0;
	Adventure adventure = new Adventure();
	Treinador treinador = new Treinador("Leo");
	long tm = System.currentTimeMillis();
	final String mapa[][] = {
			{"-","-","-","-","-","-","-","-","-"},
			{"-","*","*","*","*","*"," "," ","-"},	
			{"-","*","*","*","*","*","*"," ","-"},
			{"-","*","*"," "," "," "," "," ","-"},
			{"-","*"," "," "," ","T"," "," ","-"},
			{"-"," "," ","*","*","*"," "," ","-"},
			{"-"," "," ","*","*","*"," "," ","-"},
			{"-"," "," ","*","*","*"," "," ","-"},
			{"-","-","-","-","-","-","-","-","-"},
	};
	
	
	for(Time = 0;Time <20; tm = tm + 5000) {
		adventure.addEvent(adventure.new Walk(tm,mapa,treinador));
		adventure.run();
		Time++;
		
	}
	}

}
