package digimons;

/**
 * Clase que contiene métodos para gestionar los ataques de los Digimons.
 * 
 * @autor TuNombre
 */
public class attack {
    
    /**
     * Reduce la cantidad de veces que un Digimon puede usar su primer ataque especial en uno.
     * 
     * @param attack_times La cantidad actual de veces que el Digimon puede atacar.
     * @return La cantidad actualizada de veces que el Digimon puede atacar después de usar el primer ataque especial.
     */
    public static int use_attack_1(int attack_times) {
        return attack_times - 1;
    }
    
    /**
     * Reduce la cantidad de veces que un Digimon puede usar su segundo ataque especial en dos.
     * 
     * @param attack_times La cantidad actual de veces que el Digimon puede atacar.
     * @return La cantidad actualizada de veces que el Digimon puede atacar después de usar el segundo ataque especial.
     */
    public static int use_attack_2(int attack_times) {
        return attack_times - 2;
    }
}
