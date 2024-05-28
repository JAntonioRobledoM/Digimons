package digimons;

import java.util.List;
import java.util.Scanner;

public class Digimon {
	
	private String name;
	private int lvl;
	private int attack_points;
	private int health;
	private int attack_times;
	private int DP1;
	private int DP2;
	
	public Digimon(String name, int lvl, int attack_points, int health, int attack_times, int DP1, int DP2) {
		this.name = name;
		this.lvl = lvl;
		this.attack_points = attack_points;
		this.health = health;
		this.attack_times = attack_times;
		this.DP1 = DP1;
		this.DP2 = DP2;
	}
	
	public static int elige(List<Digimon> digimonList) {
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		int cont = 1;
		System.out.println("¿Qué Digimon quieres usar?");
		for (Digimon digimon : digimonList) {
			System.out.println(cont + ". " + digimon);
			cont++;
		}
		eleccion = sc.nextInt();
		return eleccion;
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
