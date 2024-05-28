package digimons;

import funciones.generate_digimon_name;
import funciones.random_num;

public class batallaDigital {
	private String name;
	private int lvl;
	private int attack_points;
	private int health;
	private int attack_times;
	private int DP1;
	private int DP2;
	
	public batallaDigital(String name, int lvl, int attack_points, int health, int attack_times, int DP1, int DP2) {
		this.name = name;
		this.lvl = lvl;
		this.attack_points = attack_points;
		this.health = health;
		this.attack_times = attack_times;
		this.DP1 = DP1;
		this.DP2 = DP2;
	}
	
	public void generarEnemigo() {
		
		batallaDigital enemigo = new batallaDigital("", 0, 0, 0, 0, 0, 0);
		
		enemigo.setName(generate_digimon_name.generar_nombre(random_num.generarNumeroAleatorio(1, 3)));
		
		enemigo.setLvl(random_num.generarNumeroAleatorio(1, 5));
		
		enemigo.setAttack_points(enemigo.getLvl()*5);
		
		enemigo.setHealth(enemigo.getLvl()*10);

		enemigo.setAttack_times(10);
		
		enemigo.setDP1(enemigo.getAttack_points());
		
		enemigo.setDP2(enemigo.getAttack_points()*2);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getAttack_points() {
		return attack_points;
	}

	public void setAttack_points(int attack_points) {
		this.attack_points = attack_points;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack_times() {
		return attack_times;
	}

	public void setAttack_times(int attack_times) {
		this.attack_times = attack_times;
	}

	public int getDP1() {
		return DP1;
	}

	public void setDP1(int dP1) {
		DP1 = dP1;
	}

	public int getDP2() {
		return DP2;
	}

	public void setDP2(int dP2) {
		DP2 = dP2;
	}
}
