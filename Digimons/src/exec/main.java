package exec;

import java.util.*;
import digimons.Digimon;

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
					
					String name;
					int lvl;
					int attack_points;
					int health;
					int attack_times;
					Digimon digimon = new Digimon("", 0, 0, 0, 0);
					
					System.out.println("Introduce el nombre del Digimon");
					digimon.setName(name = sc.next());
					System.out.println("Introduce el nombre del Digimon");
					digimon.setLvl(lvl = sc.nextInt());
					System.out.println("Introduce el nombre del Digimon");
					digimon.setAttack_points(attack_points = sc.nextInt());
					System.out.println("Introduce el nombre del Digimon");
					digimon.setHealth(health = sc.nextInt());
					System.out.println("Introduce el nombre del Digimon");
					digimon.setAttack_times(attack_times = sc.nextInt());
				break;
				case 2:
					System.out.println("Has salido del programa");
					programa = false;
				break;
			}
		}while(programa); 
	}

}
