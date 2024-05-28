package exec;

import java.util.*;
import digimons.*;
import funciones.*;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean programa = true;
		int opcion;
		
		do {
			
			Domador domador = new Domador("");
			
			System.out.println("Introduce el nombre del Domador");
			domador.setNombre(sc.nextLine());
			
			System.out.println("Introduce una opcion\n1. Iniciar Batalla\n2. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					
					List<Digimon> digimonList = new ArrayList<>();
					
					Digimon digimon1 = new Digimon("", 0, 0, 0, 0, 0, 0);
					
					digimon1.setName(generate_digimon_name.generar_nombre(random_num.generarNumeroAleatorio(1, 3)));
					
					digimon1.setLvl(random_num.generarNumeroAleatorio(1, 5));
					
					digimon1.setAttack_points(digimon1.getLvl()*5);
					
					digimon1.setHealth(digimon1.getLvl()*10);

					digimon1.setAttack_times(10);
					
					digimon1.setDP1(digimon1.getAttack_points());
					
					digimon1.setDP2(digimon1.getAttack_points()*2);
					
					digimonList.add(digimon1);
					
					System.out.println("Se ha creado tu Digimon");
					System.out.println("Es de tipo: " + digimon1.getName());
					System.out.println("Su nivel es: " + digimon1.getLvl());
					System.out.println("Su nivel de ataque es: " + digimon1.getAttack_points());
					System.out.println("Sus puntos de vida son: " + digimon1.getHealth());
					System.out.println("Sus veces de ataque son: " + digimon1.getAttack_times());
					System.out.println("El daño del DP1 es de: " + digimon1.getDP1());
					System.out.println("El daño del DP2 es de: " + digimon1.getDP2());
					
					boolean fin_partida = true;
					while(fin_partida) {
						batallaDigital Enemigo = new batallaDigital("", 0, 0, 0, 0, 0, 0);
						System.out.println("Te enfrentas al siguiente Digimon");
						System.out.println("Es de tipo: " + Enemigo.getName());
						System.out.println("Su nivel es: " + Enemigo.getLvl());
						System.out.println("Su nivel de ataque es: " + Enemigo.getAttack_points());
						System.out.println("Sus puntos de vida son: " + Enemigo.getHealth());
						System.out.println("Sus veces de ataque son: " + Enemigo.getAttack_times());
						System.out.println("El daño del DP1 es de: " + Enemigo.getDP1());
						System.out.println("El daño del DP2 es de: " + Enemigo.getDP2());
						
						int initial_health = Enemigo.getHealth();
						Digimon.elige(digimonList);
						if(Domador.pelea() == 1) {
							Enemigo.setHealth(Enemigo.getHealth() - digimon1.getDP1());
						}else if(Domador.pelea() == 2) {
							Enemigo.setHealth(Enemigo.getHealth() - digimon1.getDP2());
						}else if(Domador.pelea() == 3) {
							if(Domador.captura(initial_health, Enemigo.getHealth())){
								digimonList.add(Enemigo);
							}
						}
						
					}
					System.out.println("La partida ha finalizado");
				break;
				case 2:
					System.out.println("Has salido del programa");
					programa = false;
				break;
			}
		}while(programa); 
	}

}
