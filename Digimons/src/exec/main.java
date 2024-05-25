package exec;

import java.util.*;
import digimons.*;
import funciones.*;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean programa = true;
		int opcion;
		
		do {
			System.out.println("Introduce una opcion\n1. Crear digimon\n2. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					
					Digimon digimon = new Digimon("", 0, 0, 0, 0);
					
					digimon.setName(generate_digimon_name.generar_nombre(random_num.generarNumeroAleatorio(1, 3)));
					
					digimon.setLvl(random_num.generarNumeroAleatorio(1, 5));
					
					digimon.setAttack_points(digimon.getLvl()*5);
					
					digimon.setHealth(digimon.getLvl()*10);

					digimon.setAttack_times(10);
					
					System.out.println("Se ha creado tu Digimon");
					System.out.println("Es de tipo: " + digimon.getName());
					System.out.println("Su nivel es: " + digimon.getLvl());
					System.out.println("Su nivel de ataque es: " + digimon.getAttack_points());
					System.out.println("Sus puntos de vida son: " + digimon.getHealth());
					System.out.println("Sus veces de ataque son: " + digimon.getAttack_times());
					
				break;
				case 2:
					System.out.println("Has salido del programa");
					programa = false;
				break;
			}
		}while(programa); 
	}

}
