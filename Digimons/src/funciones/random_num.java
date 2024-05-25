package funciones;

import java.util.Random;

public class random_num {
	 public static int generarNumeroAleatorio(int minimo, int maximo) {
	        
	        Random random = new Random();

	        return random.nextInt((maximo - minimo) + 1) + minimo;
	    }
}
