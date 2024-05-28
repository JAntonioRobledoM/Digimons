package digimons;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Domador {
	
	private String nombre;
	
	static boolean Agumon = false;
	static boolean Gabumon = false;
	static boolean Patamon = false;
	
	public Domador(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static boolean comprobarDigimons(List<Digimon> digimonList) {
		boolean fin = false;
		for (Digimon digimon : digimonList) {
			String nombre = digimon.getName();
			if (nombre.equals("Agumon")) {
				Agumon = true;
			}else if(nombre.equals("Gabumon")) {
				Gabumon = true;
			}else if(nombre.equals("Patamon")) {
				Patamon = true;
			}else if(Agumon == true && Gabumon == true && Patamon == true) {
				fin = true;
			}
		}
		return fin;
	}
	
	public static boolean captura(int health, int initial_health) {
		
		boolean capturar = false;;
		
		if(health < initial_health - 20) {
			capturar = true;
			System.out.println("Se ha capturado el Digimon");
		}else {
			System.out.println("No se ha podido capturar al Digimon");
		}
		
		return capturar;
	}
	
	public static int pelea() {
		Scanner sc = new Scanner(System.in);
		int eleccion = 0;
		System.out.println("Elige una opción\n1. Ataque 1\n2. Ataque 2\n3. Capturar Digimon");
		return eleccion;
	}
}