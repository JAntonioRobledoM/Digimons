package digimons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que representa a un Domador de Digimons.
 * El Domador puede capturar Digimons y realizar diferentes acciones en el juego.
 * 
 * @autor JARM
 */
public class Domador {
    
    private String nombre;
    
    static boolean Agumon = false;
    static boolean Gabumon = false;
    static boolean Patamon = false;
    
    /**
     * Constructor para crear un Domador con un nombre dado.
     * 
     * @param nombre El nombre del Domador.
     */
    public Domador(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del Domador.
     * 
     * @return El nombre del Domador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del Domador.
     * 
     * @param nombre El nuevo nombre del Domador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Comprueba si el Domador tiene a los Digimons Agumon, Gabumon y Patamon.
     * 
     * @param digimonList La lista de Digimons del Domador.
     * @return true si el Domador tiene a Agumon, Gabumon y Patamon; false en caso contrario.
     */
    public static boolean comprobarDigimons(List<Digimon> digimonList) {
        boolean fin = false;
        for (Digimon digimon : digimonList) {
            String nombre = digimon.getName();
            if (nombre.equals("Agumon")) {
                Agumon = true;
            } else if (nombre.equals("Gabumon")) {
                Gabumon = true;
            } else if (nombre.equals("Patamon")) {
                Patamon = true;
            }
            if (Agumon && Gabumon && Patamon) {
                fin = true;
                break;
            }
        }
        return fin;
    }
    
    /**
     * Intenta capturar un Digimon basado en su salud.
     * 
     * @param health La salud actual del Digimon.
     * @param initial_health La salud inicial del Digimon.
     * @return true si el Digimon fue capturado; false en caso contrario.
     */
    public static boolean captura(int health, int initial_health) {
        boolean capturar = false;
        
        if (health < initial_health - 20) {
            capturar = true;
            System.out.println("Se ha capturado el Digimon");
        } else {
            System.out.println("No se ha podido capturar al Digimon");
        }
        
        return capturar;
    }
    
    /**
     * Permite al Domador elegir una acción durante la batalla.
     * 
     * @return La opción elegida: 1 para Ataque 1, 2 para Ataque 2, 3 para Capturar Digimon.
     * @throws IllegalArgumentException si la entrada no es un número válido.
     */
    public static int pelea() {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        System.out.println("Elige una opción\n1. Ataque 1\n2. Ataque 2\n3. Capturar Digimon");
        if (sc.hasNextInt()) {
            eleccion = sc.nextInt();
        } else {
            System.out.println("Entrada no válida. Por favor, introduce un número.");
            sc.next();
            throw new IllegalArgumentException("Entrada no válida: no es un número entero.");
        }
        return eleccion;
    }
}
