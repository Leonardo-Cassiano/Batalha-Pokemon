package batalhaPokemon;

public class Battle extends Event{
		
	Treinador treinador1;
	Treinador treinador2;
	Mewtwo mewtwo;
	Exeggutor exeggutor;
	Dewgong dewgong;
	Doduo doduo;
	Squirtle squirtle;
	Aerodactyl aerodactyl;
	Gastly gastly;
	Magnemite magnemite;
	Machop machop;
	Venonat venonat;
	Parasect parasect;
	Rhydon rhydon;
	
		
	public Battle(long eventTime,Mewtwo mewtwo, Exeggutor exeggutor, Dewgong dewgong, Doduo doduo, Squirtle squirtle, Aerodactyl aerodactyl, Gastly gastly, Magnemite magnemite, Machop machop, Venonat venonat,Parasect parasect,Rhydon rhydon, Treinador treinador1, Treinador treinador2) {
			super(eventTime);
			this.mewtwo = mewtwo;
			this.exeggutor = exeggutor;
			this.dewgong = dewgong;
			this.doduo = doduo;
			this.squirtle = squirtle;
			this.aerodactyl = aerodactyl;
			this.gastly = gastly;
			this.magnemite = magnemite;
			this.machop = machop;
			this.venonat = venonat;
			this.parasect = parasect;
			this.rhydon = rhydon;
			this.treinador1 = treinador1;
			this.treinador2 = treinador2;
			this.treinador1.teamformation(mewtwo, squirtle, exeggutor, dewgong, doduo, aerodactyl);
			this.treinador2.teamformation(gastly, parasect, magnemite, venonat, rhydon, machop);
			treinador1.Nome = "Ayumi";
			treinador2.Nome = "Ikki";
			
			mewtwo.Def = 306;
			squirtle.Def = 251;
			exeggutor.Def = 276;
			dewgong.Def = 284;
			doduo.Def = 207;
			aerodactyl.Def = 251;
			gastly.Def = 174;
			parasect.Def = 284;
			magnemite.Def = 262;
			venonat.Def = 218;
			rhydon.Def = 372;
			machop.Def = 218;
	}
	
	
	public void action() {
		int damage;
		mewtwo.Def = 306;
		squirtle.Def = 251;
		exeggutor.Def = 276;
		dewgong.Def = 284;
		doduo.Def = 207;
		aerodactyl.Def = 251;
		gastly.Def = 174;
		parasect.Def = 284;
		magnemite.Def = 262;
		venonat.Def = 218;
		rhydon.Def = 372;
		machop.Def = 218;
		
		
		System.out.println("Pokemon battle starts");
		System.out.println("First turn begin");
		System.out.println("Trainer1 sent mewtwo and trainer2 sent gastly");
		
		damage = 2*mewtwo.Psychic(174);
		
		if(damage > gastly.HP) {
			damage = gastly.HP;
		}
		
		else
			gastly.HP = gastly.HP - damage*2;
		
		System.out.println("Mewtwo used Psychic,it is super effective, gastly takes:" + damage);
		System.out.println("Gastly fainted");
		
		System.out.println("Trainer 2 sent Parasect");
		System.out.println("Second turn begin");
		
		damage = 1*mewtwo.Psychic(284);
		
		if(damage > parasect.HP) {
			damage = parasect.HP;
		}
		
		else
			parasect.HP = parasect.HP - damage;
		
		System.out.println("Mewtwo used Psychic, parasect takes:" + damage);
		
		damage = 2*parasect.XScissor(306);
		
		if(damage > mewtwo.HP) {
			damage = mewtwo.HP;
		}
		
		else
			mewtwo.HP = mewtwo.HP - damage;
		
		System.out.println("Parasect used XScissor,it is super effective, mewtwo takes:" + damage);
			
		System.out.println("Third turn begin");
		
		damage = 1*mewtwo.Psychic(284);
		
		if(damage > parasect.HP) {
			damage = parasect.HP;
		}
		
		else
			parasect.HP = parasect.HP - damage;
		
		System.out.println("Mewtwo used Psychic, parasect takes:" + damage);
		
		damage = 2*parasect.LifeLeech(306);
		
		if(damage > mewtwo.HP) {
			damage = mewtwo.HP;
		}
		
		else
			mewtwo.HP = mewtwo.HP - damage;
		
		System.out.println("Parasect used LifeLeech,it is super effective, mewtwo takes:" + damage);
		
		System.out.println("Fourth turn begin");
		
		damage = 1*mewtwo.Psychic(284);
		
		if(damage > parasect.HP) {
			damage = parasect.HP;
		}
		
		else
			parasect.HP = parasect.HP - damage*2;
		
		System.out.println("Mewtwo used Psychic,takes:" + damage);
		System.out.println("Paraect fainted");
		
		System.out.println("Trainer 2 sent Rhydon");
		
		System.out.println("Fifth turn begin");
		
		damage = 1*mewtwo.Psychic(372);
		
		if(damage > rhydon.HP) {
			damage = rhydon.HP;
		}
		
		else
			rhydon.HP = rhydon.HP - damage;
		
		System.out.println("Mewtwo used Psychic, rhydon takes:" + damage);
		
		damage = 1*rhydon.MegaHorn(306);
		
		if(damage > mewtwo.HP) {
			damage = mewtwo.HP;
		}
		
		else
			mewtwo.HP = mewtwo.HP - damage;
		
		System.out.println("Rhydon used MegaHorn, mewtwo takes:" + damage);
		System.out.println("Mewtwo fainted");
		
		System.out.println("Trainer 1 sent Exeggutor");
		
		System.out.println("Sixth turn begin");
		
		damage = 2*exeggutor.PowerWhip(376);
		
		if(damage > rhydon.HP) {
			damage = rhydon.HP;
		}
		
		else
			rhydon.HP = rhydon.HP - damage;
		
		System.out.println("Exeggutor used PowerWhip, it is super effective, Rhydon takes:" + damage);
		
		rhydon.HornDrill(276);
		
		if(damage > exeggutor.HP) {
			damage = exeggutor.HP;
		}
		
		else
			exeggutor.HP = exeggutor.HP - damage;
		
		System.out.println("Rhydon used HornDrill");
		System.out.println("Exeggutor fainted");
		
		System.out.println("Trainer 1 sent Dewgong");
		
		System.out.println("Seventh turn begin");
		
		dewgong.SheerCold(384);
		
		if(damage > rhydon.HP) {
			damage = rhydon.HP;
		}
		
		else
			rhydon.HP = rhydon.HP - damage;
		
		System.out.println("Dewgong used SheerCold");
		System.out.println("Rhydon fainted");
		
		System.out.println("Trainer 2 sent Machop");
		
		System.out.println("Eighth turn begin");
		
		damage = 1*dewgong.IceBeam(218);
		
		if(damage > machop.HP) {
			damage = machop.HP;
		}
		
		else
			machop.HP = machop.HP - damage;
		
		System.out.println("Dewgong used IceBeam, machop takes:" + damage);
		
		
		damage = 2*machop.SuperPower(284);
		
		if(damage > dewgong.HP) {
			damage = dewgong.HP;
		}
		
		else
			dewgong.HP = dewgong.HP - damage;
		
		System.out.println("machop used SuperPower, it is super effective, dewgong takes:" + damage);
		
		System.out.println("Nineth turn begin");
		
		damage = 1*dewgong.IceBeam(218);
		
		if(damage > machop.HP) {
			damage = machop.HP;
		}
		
		else
			machop.HP = machop.HP - damage;
		
		System.out.println("Dewgong used IceBeam, machop takes:" + damage);
		
		
		damage = 2*machop.SuperPower(284);
		
		if(damage > dewgong.HP) {
			damage = dewgong.HP;
		}
		
		else
			dewgong.HP = dewgong.HP - damage;
		
		System.out.println("machop used SuperPower, it is super effective, dewgong takes:" + damage);
		
		System.out.println("Dewgong fainted");
		
		System.out.println("Trainer 1 sent Aerodactyl");
		
		System.out.println("tenth turn begin");
		
		damage = 2*aerodactyl.Fly(218);
		
		if(damage > machop.HP) {
			damage = machop.HP;
		}
		
		else
			machop.HP = machop.HP - damage;
		
		System.out.println("Aerodactyl used Fly,it is super effective, machop takes:" + damage);
		
		System.out.println("Machop fainted");
		
		System.out.println("Trainer 2 sent Magnemite ");
		
		System.out.println("Eleventh turn begin");
		
		damage = 1*aerodactyl.Hyperbeam(262);
		
		if(damage > magnemite.HP) {
			damage = magnemite.HP;
		}
		
		else
			magnemite.HP = magnemite.HP - damage;
		
		System.out.println("Aerodactyl used HyperBeam, magnemite takes:" + damage);
		
		
		damage = 2*magnemite.Thunder(251);
		
		if(damage > aerodactyl.HP) {
			damage = aerodactyl.HP;
		}
		
		else
			aerodactyl.HP = aerodactyl.HP - damage;
		
		System.out.println("Magnemite used Thunder,it is super effective, Aerodactyl takes:" + damage);
		
		System.out.println("twelfth turn begin");
		
		treinador2.UsarItem(magnemite, "FullRestore");
		System.out.println("Trainer2 used FullRestore");
		
		damage = 1*aerodactyl.Hyperbeam(262);
		
		if(damage > magnemite.HP) {
			damage = magnemite.HP;
		}
		
		else
			magnemite.HP = magnemite.HP - damage;
		
		System.out.println("Aerodactyl used HyperBeam, magnemite takes:" + damage);
		
		System.out.println("Thirteenth turn begin");
		
		damage = 1*aerodactyl.Hyperbeam(262);
		
		if(damage > magnemite.HP) {
			damage = magnemite.HP;
		}
		
		else
			magnemite.HP = magnemite.HP - damage;
		
		System.out.println("Aerodactyl used HyperBeam, magnemite takes:" + damage);
		
		System.out.println("Magnemite fainted");
		
		System.out.println("Trainer 2 sent Venonat");
		
		System.out.println("Fourteenth turn begin");
		
		treinador2.FugirBatalha();
		
	}
	
	public String description() {
		return "The battle is over";
					
	}
		

	public static void main(String[] args) {
		
		long tm = System.currentTimeMillis();
		Mewtwo mewtwo = new Mewtwo();
		Exeggutor exeggutor = new Exeggutor();
		Dewgong dewgong = new Dewgong();
		Doduo doduo = new Doduo();
		Squirtle squirtle = new Squirtle();
		Aerodactyl aerodactyl = new Aerodactyl();
		Gastly gastly = new Gastly();
		Magnemite magnemite = new Magnemite();
		Machop machop = new Machop();
		Venonat venonat = new Venonat();
		Parasect parasect = new Parasect();
		Rhydon rhydon = new Rhydon();
		Treinador treinador1 = new Treinador("A"), treinador2 = new Treinador("B");
		
		
		//Problemas nas fórmulas de cálculo de dano
		Battle bt = new Battle(tm, mewtwo, exeggutor, dewgong, doduo, squirtle, aerodactyl, gastly, magnemite, machop, venonat, parasect, rhydon, treinador1, treinador2);
		bt.action();
		
	}

}
//(1)Bug, (2)Dragon, (3)Electric, (4)Fighting, (5)Fire, (6)Flying, 
//(7)Ghost, (8)Grass,(9)Ground,(10)Ice, (11)Normal, (12)Poison, (13)Psychic, (14)Rock and(15)Water

//Super effective:
//4 > 11,14,10.
//6 > 4,1,8.
//12 > 8.
//9 > 5,12,3,14.
//14 > 4,1,5,10
//1 > 8,13.
//7 >7,13.
//5 > 1,8,10.
//15 > 9,5,14
//8 > 9,14,15
//3 > 6,15.
//13 > 12,4.
//10 > 6,9,8,2
//2 > 2

//Not very effective:
//11 < 14
//4 < 6,1,12,13.
//6 < 3, 14.
//12 < 12,9,14,7,
//9 < 1,8.
//14 < 4,9.
//1 < 4,6,12,5,7.
//5 < 5,2,15,14.
//15 < 15,8,2.
//8 < 6,12,1,5,8,2.
//3 < 8,3,2.
//13 < 13
//10 < 5,10,15.

//No effect:
//11 = 7.
//4 = 7.
//9 = 6.
//7 = 11.
//3 = 9


//DAMAGE = ((42 * power * ATK/DEF)/50) + 2