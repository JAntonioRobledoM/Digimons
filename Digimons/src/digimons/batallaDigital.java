package digimons;

import funciones.generate_digimon_name;
import funciones.random_num;

/**
 * Clase que representa una batalla digital entre Digimons.
 * 
 * @autor JARM
 */
public class batallaDigital {
    // Atributos de la clase batallaDigital
    private String name;
    private int lvl;
    private int attack_points;
    private int health;
    private int attack_times;
    private int DP1;
    private int DP2;

    /**
     * Constructor para crear una instancia de batallaDigital con las características especificadas.
     * 
     * @param name El nombre del Digimon.
     * @param lvl El nivel del Digimon.
     * @param attack_points Los puntos de ataque del Digimon.
     * @param health La salud del Digimon.
     * @param attack_times La cantidad de veces que el Digimon puede atacar.
     * @param DP1 El daño del primer ataque especial del Digimon.
     * @param DP2 El daño del segundo ataque especial del Digimon.
     */
    public batallaDigital(String name, int lvl, int attack_points, int health, int attack_times, int DP1, int DP2) {
        this.name = name;
        this.lvl = lvl;
        this.attack_points = attack_points;
        this.health = health;
        this.attack_times = attack_times;
        this.DP1 = DP1;
        this.DP2 = DP2;
    }

    /**
     * Genera un enemigo para la batalla.
     * El enemigo se genera con un nombre aleatorio y características de nivel y ataque.
     */
    public void generarEnemigo() {
        // Creación de una instancia de batallaDigital para representar al enemigo
        batallaDigital enemigo = new batallaDigital("", 0, 0, 0, 0, 0, 0);

        // Generación aleatoria del nombre del enemigo usando la clase generate_digimon_name
        enemigo.setName(generate_digimon_name.generar_nombre(random_num.generarNumeroAleatorio(1, 3)));

        // Generación aleatoria del nivel del enemigo entre 1 y 5
        enemigo.setLvl(random_num.generarNumeroAleatorio(1, 5));

        // Asignación de los puntos de ataque del enemigo basados en su nivel
        enemigo.setAttack_points(enemigo.getLvl() * 5);

        // Asignación de la salud del enemigo basada en su nivel
        enemigo.setHealth(enemigo.getLvl() * 10);

        // Asignación de la cantidad de veces que el enemigo puede atacar
        enemigo.setAttack_times(10);

        // Asignación del daño del primer ataque especial del enemigo
        enemigo.setDP1(enemigo.getAttack_points());

        // Asignación del daño del segundo ataque especial del enemigo
        enemigo.setDP2(enemigo.getAttack_points() * 2);
    }

    // Métodos getter y setter para los atributos de la clase batallaDigital
    // Nota: No se agregan comentarios adicionales a estos métodos ya que su funcionalidad es evidente a partir de sus nombres y parámetros.

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
     * Obtiene el valor de ataque del primer ataque especial del Digimon.
     * 
     * @return El valor de ataque del primer ataque especial del Digimon.
     */
    public int getDP1() {
        return DP1;
    }

    /**
     * Establece el valor de ataque del primer ataque especial del Digimon.
     * 
     * @param dP1 El nuevo valor de ataque del primer ataque especial del Digimon.
     */
    public void setDP1(int dP1) {
        DP1 = dP1;
    }

    /**
     * Obtiene el valor de ataque del segundo ataque especial del Digimon.
     * 
     * @return El valor de ataque del segundo ataque especial del Digimon.
     */
    public int getDP2() {
        return DP2;
    }

    /**
     * Establece el valor de ataque del segundo ataque especial del Digimon.
     * 
     * @param dP2 El nuevo valor de ataque del segundo ataque especial del Digimon.
     */
    public void setDP2(int dP2) {
        DP2 = dP2;
    }
}

