package digimons;

import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa un Digimon con sus características y acciones.
 * 
 * @autor JARM
 */
public class Digimon {
	
	private String name;
	private int lvl;
	private int attack_points;
	private int health;
	private int attack_times;
	private int DP1;
	private int DP2;
	
	/**
	 * Constructor para crear un Digimon con las características especificadas.
	 * 
	 * @param name El nombre del Digimon.
	 * @param lvl El nivel del Digimon.
	 * @param attack_points Los puntos de ataque del Digimon.
	 * @param health La salud del Digimon.
	 * @param attack_times La cantidad de veces que el Digimon puede atacar.
	 * @param DP1 El daño del primer ataque especial del Digimon.
	 * @param DP2 El daño del segundo ataque especial del Digimon.
	 */
	public Digimon(String name, int lvl, int attack_points, int health, int attack_times, int DP1, int DP2) {
		this.name = name;
		this.lvl = lvl;
		this.attack_points = attack_points;
		this.health = health;
		this.attack_times = attack_times;
		this.DP1 = DP1;
		this.DP2 = DP2;
	}
	
	/**
	 * Permite al usuario elegir un Digimon de una lista.
	 * 
	 * @param digimonList La lista de Digimons disponibles.
	 * @return El índice del Digimon elegido.
	 */
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

	/**
	 * Obtiene el nombre del Digimon.
	 * 
	 * @return El nombre del Digimon.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Establece el nombre del Digimon.
	 * 
	 * @param name El nuevo nombre del Digimon.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtiene el nivel del Digimon.
	 * 
	 * @return El nivel del Digimon.
	 */
	public int getLvl() {
		return lvl;
	}

	/**
	 * Establece el nivel del Digimon.
	 * 
	 * @param lvl El nuevo nivel del Digimon.
	 */
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	/**
	 * Obtiene los puntos de ataque del Digimon.
	 * 
	 * @return Los puntos de ataque del Digimon.
	 */
	public int getAttack_points() {
		return attack_points;
	}

	/**
	 * Establece los puntos de ataque del Digimon.
	 * 
	 * @param attack_points Los nuevos puntos de ataque del Digimon.
	 */
	public void setAttack_points(int attack_points) {
		this.attack_points = attack_points;
	}

	/**
	 * Obtiene la salud del Digimon.
	 * 
	 * @return La salud del Digimon.
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Establece la salud del Digimon.
	 * 
	 * @param health La nueva salud del Digimon.
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * Obtiene la cantidad de veces que el Digimon puede atacar.
	 * 
	 * @return La cantidad de veces que el Digimon puede atacar.
	 */
	public int getAttack_times() {
		return attack_times;
	}

	/**
	 * Establece la cantidad de veces que el Digimon puede atacar.
	 * 
	 * @param attack_times La nueva cantidad de veces que el Digimon puede atacar.
	 */
	public void setAttack_times(int attack_times) {
		this.attack_times = attack_times;
	}

	/**
	 * Obtiene el daño del primer ataque especial del Digimon.
	 * 
	 * @return El daño del primer ataque especial del Digimon.
	 */
	public int getDP1() {
		return DP1;
	}

	/**
	 * Establece el daño del primer ataque especial del Digimon.
	 * 
	 * @param dP1 El nuevo daño del primer ataque especial del Digimon.
	 */
	public void setDP1(int dP1) {
		DP1 = dP1;
	}

	/**
	 * Obtiene el daño del segundo ataque especial del Digimon.
	 * 
	 * @return El daño del segundo ataque especial del Digimon.
	 */
	public int getDP2() {
		return DP2;
	}

	/**
	 * Establece el daño del segundo ataque especial del Digimon.
	 * 
	 * @param dP2 El nuevo daño del segundo ataque especial del Digimon.
	 */
	public void setDP2(int dP2) {
		DP2 = dP2;
	}
}
