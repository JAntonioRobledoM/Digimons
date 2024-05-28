package funciones;

import java.util.Random;

/**
 * Clase utilitaria para generar números aleatorios.
 * 
 * @author JARM
 */
public class random_num {

    /**
     * Genera un número aleatorio entre un valor mínimo y máximo (ambos incluidos).
     * 
     * @param minimo El valor mínimo del rango.
     * @param maximo El valor máximo del rango.
     * @return Un número aleatorio entre minimo y maximo (incluidos).
     * @throws IllegalArgumentException si minimo es mayor que maximo.
     */
    public static int generarNumeroAleatorio(int minimo, int maximo) {
        if (minimo > maximo) {
            throw new IllegalArgumentException("El valor mínimo no puede ser mayor que el valor máximo.");
        }
        
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
